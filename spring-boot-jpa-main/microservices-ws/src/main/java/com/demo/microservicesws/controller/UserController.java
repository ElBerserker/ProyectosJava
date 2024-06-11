package com.demo.microservicesws.controller;

import com.demo.microservicesws.Service.UserService;
import com.demo.microservicesws.models.User;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.util.Optional;
import javafx.scene.layout.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
     
    @Autowired
    private UserService service;
    
    public UserController (UserService service) {
    
       this.service = service;
    
    }
    
    @ApiOperation(value = "Create")
    @PostMapping(value = "/user" )
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Date information was created"),
        @ApiResponse(code = 500, message = "Date information was not created")
    })    
    public ResponseEntity <User> createUsuario (
        @RequestBody
        User entity) {
    
        ResponseEntity<User> result = service.saveUsuario(entity);
        return result;
    }
    
    @ApiOperation(value = "Get")
    @GetMapping(value = "/user/{userid}" )
       @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Date information was created"),
        @ApiResponse(code = 500, message = "Date information was not created")
    }) 
    public ResponseEntity<Optional<User>> getUsuarioByID (@PathVariable("userid") Integer identity){
        System.out.print("");
        return service.getUsuarioId(identity); 
    }
}

