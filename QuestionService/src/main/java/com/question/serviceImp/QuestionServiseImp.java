package com.question.serviceImp;

import com.question.repository.QuestionRepo;
import com.question.service.QuestionService;
import org.springframework.stereotype.Service;


@Service
public class QuestionServiseImp implements QuestionService {

    private final QuestionRepo questionRepo;

    public QuestionServiseImp(QuestionRepo questionRepo) {
        this.questionRepo = questionRepo;
    }

    @Override
    public Object findQuestionById(Long id) {
        return questionRepo.findById(id);
    }

    @Override
    public Object allQuestion() {
        return questionRepo.findAll();
    }

    @Override
    public Object getQuizId(Long quizId) {
        return questionRepo.findByQuizId(quizId);
    }
}
