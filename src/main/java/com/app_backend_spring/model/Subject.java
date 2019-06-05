package com.app_backend_spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="subjects")
public class Subject {
    @Id
    private String _id;
    private String name;
    private String description;
    private String amount;

    public Subject(String _id, String name, String description, String amount) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.amount = amount;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
