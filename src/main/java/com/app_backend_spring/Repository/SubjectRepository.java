package com.app_backend_spring.Repository;

import com.app_backend_spring.model.Subject;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SubjectRepository extends MongoRepository<Subject,String> {
    Subject findBy_id(String _id);
}
