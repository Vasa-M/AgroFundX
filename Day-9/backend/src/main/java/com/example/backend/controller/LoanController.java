package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.LoanApplicantModel;
import com.example.backend.service.LoanService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;





// @RequestMapping("/api/v1/auth")
// @RequiredArgsConstructor


@RestController
public class LoanController 
{

    @Autowired
    LoanService service;

    @PostMapping("/apply")
    public boolean add(@RequestBody LoanApplicantModel loanapplicant) 
    {
        return service.addLoan(loanapplicant);
    }
    
    @GetMapping("/get")
    public List <LoanApplicantModel> read()
    {
        return service.readLoan();
    }
    
}
