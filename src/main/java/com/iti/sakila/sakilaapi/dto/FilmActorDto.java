package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.FilmActor} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class FilmActorDto implements Serializable {
    private final Instant lastUpdate;
}