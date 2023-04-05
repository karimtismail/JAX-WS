package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.FilmText} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class FilmTextDto implements Serializable {
    private final Short id;
    private final String title;
    private final String description;
}