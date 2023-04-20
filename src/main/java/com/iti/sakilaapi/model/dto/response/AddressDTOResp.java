package com.iti.sakilaapi.model.dto.response;

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
public class AddressDTOResp implements Serializable {
    private Integer id;
    private String address;
    private String address2;
    private String district;
    private CityDTOResp city;
    private String postalCode;
    private String phone;
    private Instant lastUpdate;

    public AddressDTOResp(String address, String address2, String district, CityDTOResp city, String postalCode, String phone, Instant lastUpdate) {
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }

    public AddressDTOResp(Integer id, String address, String address2, String district, CityDTOResp city, String postalCode, String phone, Instant lastUpdate) {
        this.id = id;
        this.address = address;
        this.address2 = address2;
        this.district = district;
        this.city = city;
        this.postalCode = postalCode;
        this.phone = phone;
        this.lastUpdate = lastUpdate;
    }
}
