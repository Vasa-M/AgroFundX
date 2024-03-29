package com.example.backend.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.backend.entity.LoanApplicantModel;

public interface LoanApplicant extends JpaRepository<LoanApplicantModel,Integer>
{
    Optional<LoanApplicantModel> findByTrackId(Long trackId);
    List<LoanApplicantModel> findByApplicantEmail(String applicantEmail);
    
    @Query("SELECT d FROM LoanApplicantModel d WHERE d.loanStatus = 'applied'")
	List<LoanApplicantModel> findByAccepted();

     @Query("SELECT d FROM LoanApplicantModel d WHERE d.applicantEmail = :applicantEmail AND d.loanType = :loanType")
    Optional<LoanApplicantModel> findByEmailAndLoanType(@Param("applicantEmail") String applicantEmail, @Param("loanType") String loanType);
}
