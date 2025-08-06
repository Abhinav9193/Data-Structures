package com.abhinav.Quizzz.Service;

import com.abhinav.Quizzz.Entity.Questions;
import com.abhinav.Quizzz.Repository.QuestionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private final QuestionsRepository questionsRepository;

    @Autowired
    public QuestionService(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    public Questions addQuestion(Questions questions)
    {
        return questionsRepository.save(questions);
    }

    public List<Questions> getAllQuestions()
    {
        return questionsRepository.findAll();
    }

    public List<Questions> getByCategory(String category)
    {
        return questionsRepository.findByCategory(category);
    }

}
