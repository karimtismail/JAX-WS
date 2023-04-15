package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.StaffDto;
import com.iti.sakilaapi.model.entity.Staff;
import com.iti.sakilaapi.service.StaffService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class StaffEndPoint {
    private final StaffService staffService;

    public StaffEndPoint() {
        staffService = new StaffService(Staff.class, StaffDto.class);
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "getAllStaff")
    public List<StaffDto> getStaffList() {
        return staffService.findAll();
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "getStaffById")
    public StaffDto getStaffById(@WebParam(name = "staffId") Short staffId) {
        return staffService.findById(staffId);
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "createNewStaff")
    public StaffDto createStaff(@WebParam(name = "staff") Staff staff) {
        return staffService.save(staff);
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "updateExistingStaff")
    public StaffDto updateStaff(@WebParam(name = "staff") Staff staff) {
        return staffService.update(staff);
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "deleteStaffById")
    public StaffDto deleteStaffById(@WebParam(name = "staffId") Short staffId) {
        return staffService.deleteById(staffId);
    }
}
