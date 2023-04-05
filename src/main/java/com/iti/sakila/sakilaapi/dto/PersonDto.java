package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Person} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class PersonDto implements Serializable {
    private final Integer id;
    private final String firstName;
    private final String midName;
    private final String lastName;
    private final String email;
    private final String phone;
}