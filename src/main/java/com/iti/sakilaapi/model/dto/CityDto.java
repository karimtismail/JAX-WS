package com.iti.sakilaapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakilaapi.model.entity.City} entity
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class CityDto implements Serializable {
    private Integer id;
    private String city;
    private Instant lastUpdate;
}