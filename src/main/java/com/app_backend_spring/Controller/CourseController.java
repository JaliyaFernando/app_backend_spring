package com.app_backend_spring.Controller;

import com.app_backend_spring.Config;
import com.app_backend_spring.Repository.CourseRepository;
import com.app_backend_spring.Repository.SubjectRepository;
import com.app_backend_spring.model.Course;
import com.app_backend_spring.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("course")
@CrossOrigin(origins = Config.a_Origin)
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SubjectController  subjectController ;

    @RequestMapping(value = "/course", method = RequestMethod.GET)
    public List<Course> getAllCourse() {
        return courseRepository.findAll();
    }

    @RequestMapping(value = "/course/{id}", method = RequestMethod.GET)
    public Course getCourseByID(@PathVariable("id")String id)
    {
        Course course = courseRepository.findBy_id(id);
        return course;
    }
    @RequestMapping(value = "/price/{id}", method = RequestMethod.GET)
    public Double getCoursePriceByID(@PathVariable("id")String id)
    {
        Course course = courseRepository.findBy_id(id);
        double amount = 0;
        for(int i = 0 ; i < course.getSubjects().size(); i++){
            Subject sub = subjectController.getSubjectById(course.getSubjects().get(i));

            if(sub == null){

            }else {
                amount = amount + Double.parseDouble(sub.getAmount());
            }
        }
        return amount;
    }
}
