package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by nikola.kaloyanov on 2/8/2016.
 */
@Entity
public class Question
{
	@Id
	@GeneratedValue
	private long id;
	private String text;

	public long getId()
	{
		return id;
	}

	public String getText()
	{
		return text;
	}

	public Question()
	{
	}

	public Question(String text)
	{

		this.text = text;
	}
}
