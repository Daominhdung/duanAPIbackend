//package com.example.backendwebtienganh.Entity;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//
//public class Teacher {
//
//        @Id
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        private Long id;
//
//        private String name;
//        private String email;
//        private int phone;
//      private String password;
//
//        public Teacher() {
//            // Constructor mặc định (cần thiết khi sử dụng JPA)
//        }
//
//        public Teacher(String name, String email, int phone,String  password) {
//            this.name = name;
//            this.email = email;
//            this.phone = phone;
//            this.password= password;
//            // Constructor có tham số (nếu muốn tạo đối tượng với giá trị ban đầu cho các thuộc tính)
//        }
//
//        // Getter và setter cho thuộc tính "id"
//        public Long getId() {
//            return id;
//        }
//
//        public void setId(Long id) {
//            this.id = id;
//        }
//
//        // Getter và setter cho thuộc tính "name"
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        // Getter và setter cho thuộc tính "email"
//        public String getEmail() {
//            return email;
//        }
//
//        public void setEmail(String email) {
//            this.email = email;
//        }
//
//        // Getter và setter cho thuộc tính "phone"
//        public int getPhone() {
//            return phone;
//        }
//
//        public void setPhone(int phone) {
//            this.phone = phone;
//        }
//        public  String getPassword(){
//            return password;
//        }
//        public void setPassword(String password){
//            this.password=password;
//        }
//        // Thêm các getter và setter cho các thuộc tính khác của giáo viên (nếu có)
//
//        @Override
//        public String toString() {
//            return "Teacher{" +
//                    "id=" + id +
//                    ", name='" + name + '\'' +
//                    ", email='" + email + '\'' +
//                    ", phone='" + phone + '\'' +
//                    ", password='" + password + '\'' +
//                    // Thêm thông tin của các thuộc tính khác vào chuỗi trả về nếu có
//                    '}';
//        }
//    }
