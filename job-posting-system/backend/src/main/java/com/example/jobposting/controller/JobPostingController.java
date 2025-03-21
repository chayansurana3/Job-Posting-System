package com.example.jobposting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.jobposting.model.JobPosting;
import com.example.jobposting.service.JobPostingService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/jobposting")
@CrossOrigin(origins = "http://localhost:4200")  
public class JobPostingController {

    @Autowired
    private JobPostingService jobPostingService;

    @PostMapping
    public ResponseEntity<?> saveJobPosting(@RequestBody JobPosting jobPosting) {
        try {
            JobPosting savedJob = jobPostingService.saveJobPosting(jobPosting);
            return ResponseEntity.ok(savedJob);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body("Error creating job: " + e.getMessage());
        }
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
    
    @GetMapping("/search/department")
    public List<JobPosting> searchByDepartment(@RequestParam String value) {
        return jobPostingService.findByDepartment(value);
    }
    
    @GetMapping("/search/location")
    public List<JobPosting> searchByLocation(@RequestParam String value) {
        return jobPostingService.findByLocation(value);
    }
    
    @GetMapping("/search/employmentType")
    public List<JobPosting> searchByEmploymentType(@RequestParam String value) {
        return jobPostingService.findByEmploymentType(value);
    }
}