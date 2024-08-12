package br.com.demokafkaconsumer.demo.dominio;

import java.io.Serializable;

public class Student implements Serializable{

    private Long id;
    private String name;
    private String document;
    private Long courseId;

    public Student() {
    }

    public Student(String name, String document, Long courseId) {
        this.name = name;
        this.document = document;
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public String getdocument() {
        return document;
    }

    public Long getcourseId() {
        return courseId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setdocument(String document) {
        this.document = document;
    }

    public void setcourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", document=" + document + ", courseId=" + courseId + "]";
    }
}
