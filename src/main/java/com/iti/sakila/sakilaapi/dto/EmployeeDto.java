package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Employee} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class EmployeeDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String job;
}