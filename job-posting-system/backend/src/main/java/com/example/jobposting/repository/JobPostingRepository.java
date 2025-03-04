package com.example.jobposting.repository;

import com.example.jobposting.model.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {
    List<JobPosting> findByTitle(String title);
    List<JobPosting> findByTitleStartingWith(String employmentType);
    List<JobPosting> findByDescription(String description);
    List<JobPosting> findByDepartment(String dept);
    List<JobPosting> findByDepartmentStartingWith(String dept);
    List<JobPosting> findByLocation(String location);
    List<JobPosting> findByLocationStartingWith(String location);
    List<JobPosting> findBySalary(Double salary);
    List<JobPosting> findByEmploymentType(String employmentType);
    List<JobPosting> findByEmploymentTypeStartingWith(String employmentType);
}