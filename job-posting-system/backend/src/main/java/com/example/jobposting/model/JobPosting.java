package com.example.jobposting.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class JobPosting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private String department;
    private String location;
    private Double salary;
    private String employmentType;

    public JobPosting() {
    }

    public JobPosting(Long id, String title, String description, String department, String location, Double salary, String employmentType) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.department = department;
        this.location = location;
        this.salary = salary;
        this.employmentType = employmentType;
    }

    @Override
    public String toString() {
        return "JobPosting{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", department='" + department + '\'' +
                ", location='" + location + '\'' +
                ", salary=" + salary +
                ", employmentType='" + employmentType + '\'' +
                '}';
    }
};