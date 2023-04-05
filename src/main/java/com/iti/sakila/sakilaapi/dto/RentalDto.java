package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Rental} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class RentalDto implements Serializable {
    private final Integer id;
    private final Instant rentalDate;
    private final Instant returnDate;
    private final Instant lastUpdate;
}