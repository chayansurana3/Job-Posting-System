package com.example.jobposting.repository;

import com.example.jobposting.model.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    List<Candidate> findByName(String name);
    List<Candidate> findByResume(String resumeUrl);
    List<Candidate> findByEmail(String email);
    List<Candidate> findByNameContaining(String name);
    List<Candidate> findByEmailStartingWith(String email);
    List<Candidate> findByEmailEndingWith(String domain);
}