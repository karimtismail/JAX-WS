package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Language} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class LanguageDto implements Serializable {
    private final Short id;
    private final String name;
    private final Instant lastUpdate;
}