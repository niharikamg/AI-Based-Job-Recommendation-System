package com.jobrec.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;
import org.apache.tika.Tika;

@Service
public class ResumeParserService {

    public String parseResume(MultipartFile file) {
        try {
            Tika tika = new Tika();
            return tika.parseToString(file.getInputStream());
        } catch (IOException e) {
            return "Error parsing resume: " + e.getMessage();
        }
    }
}