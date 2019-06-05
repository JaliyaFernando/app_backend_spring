package com.app_backend_spring.Repository;

import com.app_backend_spring.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course,String> {
    Course findBy_id(String _id);
}
