package com.example.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.entity.LoanApplicantModel;
import com.example.backend.service.LoanService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;






// @RequestMapping("/api/v1/auth")
// @RequiredArgsConstructor

@CrossOrigin("*")
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
    @GetMapping("/get/{trackid}")
    public ResponseEntity<?> getByTrackId(@PathVariable long trackid){
        return service.getDetailsByLoanId(trackid);
    }   

    @GetMapping("/get-loans/{email}")
    public List<LoanApplicantModel> getMethodName(@PathVariable String email) {
        return service.getLoanByUser(email);
    }
    

    @PutMapping("/put/{trackid}/{status}")
    public boolean deleteFarmer(@PathVariable long trackid , @PathVariable String status){
        return service.editStatus(trackid , status);
    }

    @GetMapping("/get/applied")
    public List<LoanApplicantModel> getAppliedDetails(){
        return service.getAppliedDetails();
    }
}   

