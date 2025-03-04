package com.example.jobposting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.jobposting.model.JobPosting;
import com.example.jobposting.service.JobPostingService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobposting")
public class JobPostingController {
    
    @Autowired
    private JobPostingService jobPostingService;
    
    @PostMapping
    public JobPosting saveJobPosting(@RequestBody JobPosting jobPosting) {
        return jobPostingService.saveJobPosting(jobPosting);
    }

    @GetMapping
    public List<JobPosting> getAllJobPostings() {
        return jobPostingService.getAllJobPostings();
    }
    
    @GetMapping("/{id}")
    public Optional<JobPosting> getJobPostingById(@PathVariable Long id) {
        return jobPostingService.getJobPostingById(id);
    }

    @PutMapping("/{id}")
    public JobPosting updateJobPosting(@PathVariable Long id, @RequestBody JobPosting jobPostingDetails) {
        return jobPostingService.updateJobPosting(id, jobPostingDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteJobPostingById(@PathVariable Long id) {
        jobPostingService.deleteJobPostingById(id);
    }

    @DeleteMapping("/title/{title}")
    public void deleteJobPostingByTitle(@PathVariable String title) {
        jobPostingService.deleteJobPostingByTitle(title);
    }
}