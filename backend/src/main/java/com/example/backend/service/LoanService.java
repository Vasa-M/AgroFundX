package com.example.backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.backend.entity.LoanApplicantModel;
import com.example.backend.repository.LoanApplicant;

@Service
public class LoanService 
{
    @Autowired
    LoanApplicant repository;
    public boolean addLoan(LoanApplicantModel loanapplicant)
    {
        repository.save(loanapplicant);
        return true;
    }

    public List<LoanApplicantModel> readLoan()
    {
        return repository.findAll();
    }

    public ResponseEntity<?> getDetailsByLoanId(long trackid) {
       
        Optional<LoanApplicantModel> details = repository.findByTrackId(trackid);

        if(!details.isEmpty()){
            return ResponseEntity.ok(details.get());
        }
        return ResponseEntity.ok("please enter valid trackind id");

    }

    public boolean editStatus(long trackid , String loanstatus) {
        
        LoanApplicantModel details = repository.findByTrackId(trackid).get();

        if(details != null){
            details.setLoanStatus(loanstatus);
            repository.saveAndFlush(details);  
            return true;         
        }

        return false;
    }

    public List<LoanApplicantModel> getAppliedDetails() {
        return repository.findByAccepted();
     }

    public List<LoanApplicantModel> getLoanByUser(String email) {
        return repository.findByApplicantEmail(email);
    }

}
