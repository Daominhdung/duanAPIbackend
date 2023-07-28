package com.example.backendwebtienganh;

import com.example.backendwebtienganh.dto.AccountResponse;
//import com.example.backendwebtienganh.Entity.Permission;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan("com.example.backendwebtienganh.entity") // Adjust the package path
@EnableJpaRepositories("com.example.backendwebtienganh.repo")

public class BackendwebtienganhApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendwebtienganhApplication.class, args);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<AccountResponse> responseEntityes = restTemplate.getForEntity("http://localhost:9192/api/v1/accounts/1", AccountResponse.class);
		AccountResponse accountResponse = responseEntityes.getBody();

		// In thông tin tài khoản
		System.out.println("ID: " + accountResponse.getId());
		System.out.println("Name: " + accountResponse.getName());
		System.out.println("Description: " + accountResponse.getDescription());
		System.out.println("Guard Name: " + accountResponse.getGuardName());
		System.out.println("Created At: " + accountResponse.getCreatedAt());
		System.out.println("Updated At: " + accountResponse.getUpdatedAt());

		// In danh sách quyền
//		System.out.println("Permissions: ");
//		for (Permission permission : accountResponse.getPermissions()) {
//			System.out.println("ID: " + permission.getId());
//			System.out.println("Name: " + permission.getName());
//			System.out.println("Description: " + permission.getDescription());
//			System.out.println("Guard Name: " + permission.getGuardName());
//			System.out.println("Group: " + permission.getGroup());
//			System.out.println("Created At: " + permission.getCreatedAt());
//			System.out.println("Updated At: " + permission.getUpdatedAt());
//		}
	}

}
