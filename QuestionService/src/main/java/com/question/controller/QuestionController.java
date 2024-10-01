package com.question.controller;

import com.question.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/qus")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/question")
     public ResponseEntity<?> question(@RequestParam("id") Long id){
        return ResponseEntity.ok(questionService.findQuestionById(id));
    }
    @PostMapping("/allQuestion")
    public ResponseEntity<?> allQuestion(){
        return ResponseEntity.ok(questionService.allQuestion());
    }

    @PostMapping("/quiz")
    public ResponseEntity<?> getQuizId(@RequestParam("quizId") Long quizId){
        return ResponseEntity.ok(questionService.getQuizId(quizId));
    }
}
