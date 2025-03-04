package com.example.jobposting.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.jobposting.model.Candidate;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceImpl implements CandidateService{
    @Autowired
    private CandidateService candidateService;

    @Override
    public Candidate saveCandidate(Candidate candidate){
        return candidateService.saveCandidate(candidate);
    }

    @Override
    public Optional<Candidate> getCandidateById(Long id){
        return candidateService.getCandidateById(id);
    } 

    @Override
    public List<Candidate> getAllCandidates(){
        return candidateService.getAllCandidates();
    }

    @Override
    public Candidate updateCandidate(Long id, Candidate candidateDetails){
        return candidateService.updateCandidate(id, candidateDetails);
    }

    @Override
    public void deleteCandidateById(Long id){
        candidateService.deleteCandidateById(id);   
    }

    @Override  
    public void deleteCandidateByEmail(String email){
        candidateService.deleteCandidateByEmail(email);
    }

}
