package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by nikola.kaloyanov on 2/8/2016.
 */
@RestController
@RequestMapping("/questions")
public class QuestionsController
{

	@Autowired
	private QuestionsRepository questionsRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Question> getQuestions()
	{
		return questionsRepository.findAll();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public Question postQuestion(@RequestBody Question question)
	{
		return questionsRepository.save(question);
	}

}
