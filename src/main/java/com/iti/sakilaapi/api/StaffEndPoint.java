package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.StaffDTOReq;
import com.iti.sakilaapi.model.dto.response.StaffDTOResp;
import com.iti.sakilaapi.service.StaffService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class StaffEndPoint {
    private final StaffService staffService;

    public StaffEndPoint() {
        staffService = new StaffService();
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "getAllStaff")
    public List<StaffDTOResp> getStaffList() {
        return staffService.findAll();
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "getStaffById")
    public StaffDTOResp getStaffById(@WebParam(name = "staffId") Integer staffId) {
        return staffService.findById(staffId);
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "createNewStaff")
    public StaffDTOResp createStaff(@WebParam(name = "staff") StaffDTOReq staff) {
        staff.setLastUpdate(Instant.now());
        return staffService.save(staff);
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "updateExistingStaff")
    public StaffDTOResp updateStaff(@WebParam(name = "id") Integer id, @WebParam(name = "staff") StaffDTOReq staff) throws Exception {
        staff.setLastUpdate(Instant.now());
        return staffService.update(id, staff);
    }

    @WebResult(name = "Staff")
    @WebMethod(operationName = "deleteStaffById")
    public StaffDTOResp deleteStaffById(@WebParam(name = "staffId") Integer staffId) throws Exception {
        return staffService.deleteById(staffId);
    }
}
