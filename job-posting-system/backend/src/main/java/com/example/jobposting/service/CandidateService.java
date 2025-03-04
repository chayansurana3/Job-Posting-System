package com.example.jobposting.service;

import com.example.jobposting.model.Candidate;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface CandidateService {
    Candidate saveCandidate(Candidate candidate);
    Optional<Candidate> getCandidateById(Long id);
    List<Candidate> getAllCandidates();
    Candidate updateCandidate(Long id, Candidate candidateDetails);
    void deleteCandidateById(Long id);
    void deleteCandidateByEmail(String email);
}