package com.example.Timeappback.UserController;


import com.example.Timeappback.Dto.LoginDTO;
import com.example.Timeappback.Dto.UserDTO;
import com.example.Timeappback.Response.LoginResponse;
import com.example.Timeappback.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/user")
public class UserController
{
    @Autowired
        private UserService userService;

    @PostMapping(path = "/save")
        public String addUser(@RequestBody UserDTO userDto) {
                String id=userService.addUser(userDto);
                return id;
        }
    @PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO) {
        LoginResponse loginResponse=userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }

}
