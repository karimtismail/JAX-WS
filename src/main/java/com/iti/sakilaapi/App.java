package com.iti.sakilaapi;

import com.iti.sakilaapi.model.dto.ActorDto;
import com.iti.sakilaapi.model.dto.InventoryDto;
import com.iti.sakilaapi.model.dto.StaffDto;
import com.iti.sakilaapi.model.entity.Actor;
import com.iti.sakilaapi.model.entity.Inventory;
import com.iti.sakilaapi.model.entity.Staff;
import com.iti.sakilaapi.service.ActorService;
import com.iti.sakilaapi.service.InventoryService;
import com.iti.sakilaapi.service.StaffService;

public class App {
    public static void main(String[] args) {
        StaffService service = new StaffService(Staff.class, StaffDto.class);
        for (StaffDto staff : service.findAll()) {
            System.out.println(staff.getFirstName());
        }
    }
}