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
public class Student {
    @Id
    @Min(1)
    @Max(99999)
    @EqualsAndHashCode.Include
    private Integer studentID; // number(5,0)

    @Column(length = 30)
    @Size(max = 30)
    private String studentFirstName; // varchar(30)

    @Column(length = 30)
    @Size(max = 30)
    private String studentLastName; // varchar(30)

    @Min(1)
    @Max(99)
    private Integer grade; // number(2,0)
}



