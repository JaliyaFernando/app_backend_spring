package com.app_backend_spring.Controller;

import com.app_backend_spring.Repository.SubjectRepository;
import com.app_backend_spring.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("subject")
public class SubjectController {
    @Autowired
    private SubjectRepository subjectRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Subject> getAllSubjects(){
        return subjectRepository.findAll();
    }

    @RequestMapping(value = "/{Id}",method = RequestMethod.GET)
    public Subject getSubjectById(@PathVariable("id") String id){
        Subject subject = subjectRepository.findBy_id(id);
        return subject;
    }
}
