//package com.example.Timeappback.UserController;
//
//import com.example.Timeappback.Dto.CaseAddDTO;
//import com.example.Timeappback.Service.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/v1/registercase")
//public class RegisterCaseController {
//
//    @Autowired
//    private UserService userService;
//
//    @PostMapping("/addCase")
//    public String addCase(@RequestBody CaseAddDTO caseAddDTO) {
//        return userService.addCase(caseAddDTO);
//    }
//
////    @GetMapping("/displayCase")
////    public String displayCase(@RequestBody CaseAddDTO caseAddDTO) {
////        return userService.displayCase(caseAddDTO);
////    }
//}

package com.example.Timeappback.UserController;

import com.example.Timeappback.Dto.CaseAddDTO;
import com.example.Timeappback.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registercase")
public class RegisterCaseController {

    @Autowired
    private UserService userService;

    @PostMapping("/addCase")
    public String addCase(@RequestBody CaseAddDTO caseAddDTO) {
        return userService.addCase(caseAddDTO);
    }
    @GetMapping("/displayCases")
    public List<CaseAddDTO> displayCases() {
        return userService.getAllCases();
    }
}