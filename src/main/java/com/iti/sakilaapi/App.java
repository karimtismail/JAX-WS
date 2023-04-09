package com.iti.sakilaapi;

import com.iti.sakilaapi.dto.AddressDto;
import com.iti.sakilaapi.entity.Actor;
import com.iti.sakilaapi.service.ActorService;
import com.iti.sakilaapi.service.AddressService;

import java.time.Instant;

public class App {
    public static void main(String[] args) {

        AddressService addressService = new AddressService();
        for (AddressDto addressDto : addressService.findAll()) {
            System.out.println(addressDto.getAddress());
        }

    }
}