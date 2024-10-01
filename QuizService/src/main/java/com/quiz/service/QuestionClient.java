package com.quiz.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
 @PostMapping("/qus/question")
 Object getQuestionOfQuiz(@RequestParam("id") Long id);
}
