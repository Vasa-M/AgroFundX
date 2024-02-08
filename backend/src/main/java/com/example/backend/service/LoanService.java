package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

}
