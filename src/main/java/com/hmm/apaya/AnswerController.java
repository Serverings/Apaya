package com.hmm.apaya;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AnswerController {

    private final AnswerService service;

    public AnswerController(AnswerService service) {
        this.service = service;
    }

    @PostMapping("/yes")
    public void yes() {
        service.incrementYes();
    }

    @PostMapping("/no")
    public void no() {
        service.incrementNo();
    }

    @GetMapping("/stats")
    public AnswerCounter stats() {
        return service.getStats();
    }
}