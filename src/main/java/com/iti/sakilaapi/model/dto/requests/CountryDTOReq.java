package com.iti.sakilaapi.model.dto.requests;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@XmlRootElement
public class CountryDTOReq implements Serializable {
    private String country;
    private Instant lastUpdate;

    public CountryDTOReq(String country) {
        this.country = country;
    }
}
