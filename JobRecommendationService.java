package com.jobrec.service;

import org.springframework.stereotype.Service;
import com.jobrec.model.Candidate;

@Service
public class JobRecommendationService {

    public String getRecommendedJobs(Candidate candidate) {
        // Simulated AI Job Matching (Replace with AI Model Call)
        if (candidate.getSkills().contains("Java")) {
            return "Recommended Job: Backend Developer at Google";
        }
        return "No suitable job found.";
    }
}