package com.example.mini.domain.staff;

public enum Grade {
    ADMIN("admin"),
    MANAGER("manager");

    private String grade;

    Grade(String grade){
        this.grade = grade;
    }
}
