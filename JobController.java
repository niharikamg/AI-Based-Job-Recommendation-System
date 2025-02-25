package com.jobrec.controller;

import org.springframework.web.bind.annotation.*;
import com.jobrec.service.JobRecommendationService;
import com.jobrec.model.Candidate;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobRecommendationService jobRecommendationService;

    public JobController(JobRecommendationService jobRecommendationService) {
        this.jobRecommendationService = jobRecommendationService;
    }

    @PostMapping("/recommend")
    public String recommendJobs(@RequestBody Candidate candidate) {
        return jobRecommendationService.getRecommendedJobs(candidate);
    }
}