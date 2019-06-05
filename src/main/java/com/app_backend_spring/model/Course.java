package com.app_backend_spring.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.util.List;
@Document(collection = "courses")
public class Course {

    @Id
    private String _id;
    private String name;
    private String code;
    private String passMark;
    private String lectureInCharge;
    private List<String> subjects;

    public Course(String _id, String name, String code, String passMark, String lectureInCharge, List<String> subjects) {
        this._id = _id;
        this.name = name;
        this.code = code;
        this.passMark = passMark;
        this.lectureInCharge = lectureInCharge;
        this.subjects = subjects;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPassMark() {
        return passMark;
    }

    public void setPassMark(String passMark) {
        this.passMark = passMark;
    }

    public String getLectureInCharge() {
        return lectureInCharge;
    }

    public void setLectureInCharge(String lectureInCharge) {
        this.lectureInCharge = lectureInCharge;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }
}