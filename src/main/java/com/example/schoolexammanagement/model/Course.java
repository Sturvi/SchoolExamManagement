package com.example.schoolexammanagement.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Course {
    @Id
    @Column(length = 3)
    @Size(min = 3, max = 3)
    @EqualsAndHashCode.Include
    private String courseCode;

    @Column(length = 30)
    @Size(max = 30)
    private String courseName;

    @Min(1)
    @Max(99)
    private Integer grade;

    @Column(length = 20)
    @Size(max = 20)
    private String teacherFirstName;

    @Column(length = 20)
    @Size(max = 20)
    private String teacherLastName;

}
