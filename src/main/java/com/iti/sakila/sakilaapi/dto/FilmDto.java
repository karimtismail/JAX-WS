package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Film} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class FilmDto implements Serializable {
    private final Integer id;
    private final String title;
    private final String description;
    private final Integer releaseYear;
    private final Short rentalDuration;
    private final BigDecimal rentalRate;
    private final Integer length;
    private final BigDecimal replacementCost;
    private final String rating;
    private final String specialFeatures;
    private final Instant lastUpdate;
}