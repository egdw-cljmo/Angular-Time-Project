package com.example.Timeappback.Service;

import com.example.Timeappback.Dto.CaseAddDTO;
import com.example.Timeappback.Dto.LoginDTO;
import com.example.Timeappback.Dto.UserDTO;
import com.example.Timeappback.Response.LoginResponse;

import java.util.List;

public interface UserService {
    String addUser(UserDTO userDto);

    LoginResponse loginUser(LoginDTO loginDTO);
    String addCase(CaseAddDTO caseAddDTO);

    List<CaseAddDTO> getAllCases();


//    String displayCase(CaseAddDTO caseAddDTO);
}
