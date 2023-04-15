package com.iti.sakilaapi.model.dto;

import com.iti.sakilaapi.model.entity.Address;
import com.iti.sakilaapi.model.entity.Payment;
import com.iti.sakilaapi.model.entity.Rental;
import com.iti.sakilaapi.model.entity.Store;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class StaffDto implements Serializable {
    private Short staffId;
    private String firstName;
    private String lastName;
    private AddressDto address;
    private byte[] picture;
    private String email;
    private StoreDto store;
    private boolean active;
    private String username;
    private String password;
    private Date lastUpdate;
}