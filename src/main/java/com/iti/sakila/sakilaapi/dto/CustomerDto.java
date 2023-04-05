package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Customer} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class CustomerDto implements Serializable {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final String email;
    private final Boolean active;
    private final Instant createDate;
    private final Instant lastUpdate;
}