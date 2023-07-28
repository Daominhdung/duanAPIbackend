package com.example.backendwebtienganh.admin;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    // Cấu hình xác thực người dùng
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth
//                .inMemoryAuthentication()
//                .withUser("admin").password("{noop}adminpass").roles("ADMIN") // Thay thế "adminpass" bằng mật khẩu thật của admin
//                .and()
//                .withUser("teacher").password("{noop}teacherpass").roles("TEACHER") // Thay thế "teacherpass" bằng mật khẩu thật của giáo viên
//                .and()
//                .withUser("student").password("{noop}studentpass").roles("STUDENT"); // Thay thế "studentpass" bằng mật khẩu thật của sinh viên
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//                .antMatchers("/").permitAll() // Cho phép truy cập trang chủ mà không cần xác thực
//                .antMatchers("/api/**").permitAll() // Cho phép truy cập các API mà không cần xác thực (điều này có thể thay đổi tùy theo yêu cầu của bạn)
//                .antMatchers("/admin/**").hasRole("ADMIN") // Bảo vệ các trang /admin/ yêu cầu role "ADMIN"
//                .antMatchers("/teacher/**").hasRole("TEACHER") // Bảo vệ các trang /teacher/ yêu cầu role "TEACHER"
////                .antMatchers("/student/**").hasRole("STUDENT") // Bảo vệ các trang /student/ yêu cầu role "STUDENT"
//                .anyRequest().authenticated() // Các trang còn lại yêu cầu xác thực người dùng
//                .and()
//                .formLogin()
//                .loginPage("/login") // Trang đăng nhập tùy chỉnh
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll()
//                .and()
//                .exceptionHandling().accessDeniedPage("/403"); // Trang cấm truy cập tùy chỉnh (nếu người dùng không có quyền truy cập)
//    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/**").permitAll() // Cho phép truy cập tất cả các URL mà không cần xác thực
                .and()
                .csrf().disable()
                .headers().frameOptions().disable();
    }

//    @Configuration
//    public class CorsConfig implements WebMvcConfigurer {
//
//        @Override
//        public void addCorsMappings(CorsRegistry registry) {
//            registry.addMapping("/api/v1/**")
//                    .allowedOrigins("*") // Để cho phép gọi từ bất kỳ nguồn nào
//                    .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
//                    .allowedHeaders("*");
//        }
//    }
}


