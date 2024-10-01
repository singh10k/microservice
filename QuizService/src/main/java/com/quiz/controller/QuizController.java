package com.quiz.controller;

import com.quiz.service.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/quiz")
public class QuizController {
    private final QuizService quizService;

    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping("/all")
    public ResponseEntity<?> getQuizAll(){
        return ResponseEntity.of(Optional.ofNullable(quizService.getQuizAll()));
    }
}
