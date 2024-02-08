package com.example.backend.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.backend.Utils.DocumentUtils;
import com.example.backend.entity.Document;
import com.example.backend.repository.DocumentRepository;

import java.io.IOException;
import java.util.Optional;

@Service
public class DocumentService 
{
    @Autowired
    private DocumentRepository repository;

    public String uploadImage(MultipartFile file,String email) throws IOException {

        Document imageData = repository.save(Document.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .email(email)
                .imageData(DocumentUtils.compressImage(file.getBytes())).build());
        if (imageData != null) {
            return "file uploaded successfully : " + file.getOriginalFilename();
        }
        return null;
    }

    public byte[] downloadImage(String email){
        Optional<Document> dbImageData = repository.findByEmail(email);
        byte[] images=DocumentUtils.decompressImage(dbImageData.get().getImageData());
        return images;
    }
}
