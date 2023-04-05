package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Store} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class StoreDto implements Serializable {
    private final Short id;
    private final Instant lastUpdate;
}