package com.example.saa2.Controller;

import com.example.saa2.Entity.*;
import com.example.saa2.Service.*;
//import com.example.saa2.Service.QuestionTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    NATService natService;

    @Autowired
    TwoOptionMCQService twoOptionMCQService;

    @Autowired
    ThreeOptionMCQService threeOptionMCQService;

    @Autowired
    FourOptionMCQService fourOptionMCQService;

    @Autowired
    TestService testService;

    @RequestMapping(method = RequestMethod.POST, value = "/add/{id}/NAT")
    public String saveQuestion(@RequestBody NAT question, @PathVariable Integer id)
    {
        Test test = testService.getTest(id);
        question.setTest(test);
        natService.addQuestion(question);
        //questionTypeService.addQuestion(questionType);
        return "Question is added";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add/{id}/two")
    public String saveQuestion(@RequestBody TwoOptionMCQ question, @PathVariable Integer id)
    {
        Test test = testService.getTest(id);
        question.setTest(test);
        twoOptionMCQService.addQuestion(question);
        //questionTypeService.addQuestion(questionType);
        return "Question is added";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add/{id}/three")
    public String saveQuestion(@RequestBody ThreeOptionMCQ question, @PathVariable Integer id)
    {
        Test test = testService.getTest(id);
        question.setTest(test);
        threeOptionMCQService.addQuestion(question);
        //questionTypeService.addQuestion(questionType);
        return "Question is added";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/add/{id}/four")
    public String saveQuestion(@RequestBody FourOptionMCQ question, @PathVariable Integer id)
    {
        Test test = testService.getTest(id);
        question.setTest(test);
        fourOptionMCQService.addQuestion(question);
        //questionTypeService.addQuestion(questionType);
        return "Question is added";
    }
}
