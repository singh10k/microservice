package com.quiz.serviceImp;

import com.quiz.entity.Quiz;
import com.quiz.repository.QuizRepo;
import com.quiz.service.QuestionClient;
import com.quiz.service.QuizService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuizImpService implements QuizService {
    private final QuizRepo quizRepo;
    private final QuestionClient questionClient;

    public QuizImpService(QuizRepo quizRepo, QuestionClient questionClient) {
        this.quizRepo = quizRepo;
        this.questionClient = questionClient;
    }

    @Override
    public Object getQuizAll() {
        List<Quiz> quizzes = quizRepo.findAll();
        List<Quiz> collect = quizzes.stream().map(quiz -> {
            quiz.setQuestion(questionClient.getQuestionOfQuiz(quiz.getId()));
            return quiz;
        }).collect(Collectors.toList());
        return collect;
    }
}
