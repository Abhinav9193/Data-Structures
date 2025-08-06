package com.abhinav.Quizzz.Controller;

import com.abhinav.Quizzz.Entity.Questions;
import com.abhinav.Quizzz.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/questions")
public class QuestionsController {

    @Autowired
    private final QuestionService questionService;


    public QuestionsController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/add")
    public Questions addQuestions(@RequestBody Questions questions)
    {
        return questionService.addQuestion(questions);
    }

    @GetMapping("/all")
    public List<Questions> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }

    @GetMapping("/{category}")
    public List<Questions> getByCategory(@PathVariable String category)
    {
        return questionService.getByCategory(category);
    }

}
