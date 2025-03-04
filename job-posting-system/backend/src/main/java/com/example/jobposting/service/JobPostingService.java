package com.example.jobposting.service;

import com.example.jobposting.model.JobPosting;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public interface JobPostingService {
    JobPosting saveJobPosting(JobPosting jobPosting);
    Optional<JobPosting> getJobPostingById(Long id);
    List<JobPosting> getAllJobPostings();
    JobPosting updateJobPosting(Long id, JobPosting jobPostingDetails);
    void deleteJobPostingById(Long id);
    void deleteJobPostingByTitle(String title);
}
