package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.City} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class CityDto implements Serializable {
    private final Integer id;
    private final String city;
    private final Instant lastUpdate;
}