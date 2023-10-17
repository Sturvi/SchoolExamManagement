package com.example.schoolexammanagement.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Long id;

    @Column(length = 3)
    @Size(min = 3, max = 3)
    private String courseCode; // char(3)

    @Min(1)
    @Max(99999)
    private Integer studentID; // number(5,0)

    private Date examDate; // date

    @Min(1)
    @Max(9)
    private Integer score; // number(1,0)

}
