package br.com.jvictornascimento.user.controllers;

import br.com.jvictornascimento.user.dtos.UserRecordDto;
import br.com.jvictornascimento.user.models.UserModel;
import br.com.jvictornascimento.user.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    final
    UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser (@RequestBody @Valid UserRecordDto userRecordDto){
        var userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDto,userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(userModel));
    }

}
