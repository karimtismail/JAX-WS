package com.iti.sakilaapi.model.dto.requests;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class CityDTOReq implements Serializable {
//    private Integer cityId;
    private String city;
    private Instant lastUpdate;
}
