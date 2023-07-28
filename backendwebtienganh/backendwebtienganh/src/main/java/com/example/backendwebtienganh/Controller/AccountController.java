package com.example.backendwebtienganh.Controller;

import com.example.backendwebtienganh.dto.AccountResponse;
//import com.example.backendwebtienganh.Entity.Permission;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {
    @GetMapping("/accounts/{id}")
    public ResponseEntity<AccountResponse> getAccount(@PathVariable Long id){
//        List<Permission> permissions = new ArrayList<>();
//        Permission permission = new Permission();
//        permission.setId(4L);
//        permission.setName(permission.getUpdatedAt());
//        permission.setDescription(permission.getUpdatedAt());
//        permission.setGuardName(permission.getUpdatedAt());
//        permission.setGroup(permission.getUpdatedAt());
//        permission.setCreatedAt(permission.getUpdatedAt());
//        permission.setUpdatedAt(permission.getUpdatedAt());
//        permission.add(permission);

        AccountResponse account = new AccountResponse();
        account.setId(1L);
        account.setName(account.getUpdatedAt());
        account.setDescription(account.getUpdatedAt());
        account.setGuardName(account.getUpdatedAt());
        account.setCreatedAt(account.getUpdatedAt());
        account.setUpdatedAt(account.getUpdatedAt());
//        account.setPermissions(permissions);
        return  new ResponseEntity<>(account, HttpStatus.ACCEPTED);
    }

}
