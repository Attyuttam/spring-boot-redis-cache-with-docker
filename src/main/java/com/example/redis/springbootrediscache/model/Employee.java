package com.example.redis.springbootrediscache.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Getter
@Setter
@Table(name = "employee")
public class Employee implements Serializable {
    @Id
    @Column(name = "employee_id")
    private Integer id;

    @Column(name="department_id")
    private Integer department;

    @Column(name = "employee_name")
    private String name;

    @Column(name = "employee_role")
    private String role;
}

