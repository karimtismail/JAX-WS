package com.iti.sakila.sakilaapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

/**
 * A DTO for the {@link com.iti.sakila.sakilaapi.entity.Payment} entity
 */
@AllArgsConstructor
@Getter
@ToString
public class PaymentDto implements Serializable {
    private final Integer id;
    private final BigDecimal amount;
    private final Instant paymentDate;
    private final Instant lastUpdate;
}