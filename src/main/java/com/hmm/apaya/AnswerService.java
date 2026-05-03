package com.hmm.apaya;

import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    private final AnswerRepository repo;

    public AnswerService(AnswerRepository repo) {
        this.repo = repo;
    }

    public void incrementYes() {
        AnswerCounter data = repo.findById(1L).orElseThrow();
        data.setYesCount(data.getYesCount() + 1);
        repo.save(data);
    }

    public void incrementNo() {
        AnswerCounter data = repo.findById(1L).orElseThrow();
        data.setNoCount(data.getNoCount() + 1);
        repo.save(data);
    }

    public AnswerCounter getStats() {
        return repo.findById(1L).orElseThrow();
    }
}