package com.thbs.questionMS.repository;

import com.thbs.questionMS.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends MongoRepository<Question,Long> {
    public List<Question> findBySubject(String subject);
    public List<Question> findQuestionsBySubjectOrderByUsageCountAsc(String subject);
}
