package com.question.service;

public interface QuestionService {
    Object findQuestionById(Long id);

    Object allQuestion();

    Object getQuizId(Long quizId);
}
