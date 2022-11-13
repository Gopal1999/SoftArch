package com.example.testmanagementservice.Controller;


import com.example.testmanagementservice.Entity.*;
import com.example.testmanagementservice.Repository.QuestionRepo;
import com.example.testmanagementservice.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/question")
public class QuestionController
{
    @Autowired
    QuestionService questionService;
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

    @RequestMapping(method = RequestMethod.GET, value = "/isInstance/nat/{questionid}")
    public boolean existNATQuestion(@PathVariable int questionid)
    {
        return natService.isQuestionExist(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/isInstance/two/{questionid}")
    public boolean existTwoOptionQuestion(@PathVariable int questionid)
    {
        return twoOptionMCQService.isQuestionExist(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/isInstance/three/{questionid}")
    public boolean existThreeOptionQuestion(@PathVariable int questionid)
    {
        return threeOptionMCQService.isQuestionExist(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/isInstance/four/{questionid}")
    public boolean existFourOptionQuestion(@PathVariable int questionid)
    {
        return fourOptionMCQService.isQuestionExist(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/get/{questionid}")
    public Question getQuestion(@PathVariable int questionid)
    {
        return questionService.findQuestion(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/nat/get/{questionid}")
    public NAT getNATQuestion(@PathVariable int questionid)
    {
        return natService.findQuestion(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/two/get/{questionid}")
    public Question getTwoMCQQuestion(@PathVariable int questionid)
    {
        return twoOptionMCQService.findQuestion(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/three/get/{questionid}")
    public Question getThreewoMCQQuestion(@PathVariable int questionid)
    {
        return threeOptionMCQService.findQuestion(questionid);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/four/get/{questionid}")
    public Question getFourMCQQuestion(@PathVariable int questionid)
    {
        return fourOptionMCQService.findQuestion(questionid);
    }
}
