package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by nikola.kaloyanov on 2/8/2016.
 */
@Repository
public interface QuestionsRepository extends JpaRepository<Question, Long>
{
}
