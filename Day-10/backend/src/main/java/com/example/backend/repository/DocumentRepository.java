package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.backend.entity.Document;

import java.util.Optional;

public interface DocumentRepository extends JpaRepository<Document,Long> 
{
    Optional<Document> findByName(String fileName);

    Optional<Document> findByEmail(String email);
}