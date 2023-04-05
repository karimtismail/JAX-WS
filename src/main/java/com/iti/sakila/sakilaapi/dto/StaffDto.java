package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Staff} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class StaffDto implements Serializable {
    private final Short id;
    private final String firstName;
    private final String lastName;
    private final byte[] picture;
    private final String email;
    private final Boolean active;
    private final String username;
    private final String password;
    private final Instant lastUpdate;
}