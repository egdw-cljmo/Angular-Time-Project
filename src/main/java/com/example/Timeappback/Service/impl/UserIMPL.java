package com.example.Timeappback.Service.impl;

import com.example.Timeappback.Dto.CaseAddDTO;
import com.example.Timeappback.Dto.LoginDTO;
import com.example.Timeappback.Dto.UserDTO;
import com.example.Timeappback.Entity.RegisterCaseEntity;
import com.example.Timeappback.Entity.User;
import com.example.Timeappback.Repo.RegisterCaseRepo;
import com.example.Timeappback.Repo.UserRepo;
import com.example.Timeappback.Response.LoginResponse;
import com.example.Timeappback.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserIMPL implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private RegisterCaseRepo registerCaseRepo;

    @Override
    public String addUser(UserDTO userDto) {
        if (userDto.getUserPassword() == null || userDto.getUserPassword().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty or null");
        }


        User user = new User(
            userDto.getUserId(),
            userDto.getUserName(),
            userDto.getUserEmail(),
            this.passwordEncoder.encode(userDto.getUserPassword())
        );

        userRepo.save(user);
        return userDto.getUserName();

    }

    @Override
    public LoginResponse loginUser(LoginDTO loginDTO) {
        String msg = "";
        User user1 = userRepo.findByUserEmail(loginDTO.getUserEmail());
        if (user1 != null) {
            String password = loginDTO.getUserPassword();
            String encodedPassword = user1.getUserPassword();
            Boolean isPwdRight = passwordEncoder.matches(password, encodedPassword);
            if (isPwdRight) {
                Optional<User> user = userRepo.findOneByUserEmailAndUserPassword(loginDTO.getUserEmail(), encodedPassword);
                if (user.isPresent()) {
                    return new LoginResponse("Login Success", true);
                } else {
                    return new LoginResponse("Login Failed", false);
                }
            } else {
                return new LoginResponse("Password Incorrect", false);
            }
        } else {
            return new LoginResponse("Email does not exists", false);
        }

    }

    @Override
    public String addCase(CaseAddDTO caseAddDTO) {
        RegisterCaseEntity registerCaseEntity = new RegisterCaseEntity(
            caseAddDTO.getCaseId(),
            caseAddDTO.getDateRegister(),
            caseAddDTO.getFromTime(),
            caseAddDTO.getToTime(),
            caseAddDTO.getDuration(),
            caseAddDTO.getClientName(),
            caseAddDTO.getCaseType(),
            caseAddDTO.getCaseNumber(),
            caseAddDTO.getTypeOfWork(),
            caseAddDTO.getDescription()
        );

        registerCaseRepo.save(registerCaseEntity);
        return caseAddDTO.getClientName();
    }

    @Override
    public List<CaseAddDTO> getAllCases() {
        List<RegisterCaseEntity> registerCaseEntities = registerCaseRepo.findAll();
        return registerCaseEntities.stream().map(entity -> new CaseAddDTO(
            entity.getCase_ID(),
            entity.getDateRegister(),
            entity.getFrom_Time(),
            entity.getTo_Time(),
            entity.getDuration(),
            entity.getClient_Name(),
            entity.getCase_Type(),
            entity.getCase_Number(),
            entity.getType_Of_work(),
            entity.getDescription()
        )).collect(Collectors.toList());
    }
}

