package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.RentalDTOReq;
import com.iti.sakilaapi.model.dto.response.RentalDTOResp;
import com.iti.sakilaapi.service.RentalService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class RentalEndPoint {
    private final RentalService rentalService;

    public RentalEndPoint() {
        rentalService = new RentalService();
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "getAllRental")
    public List<RentalDTOResp> getRentalList() {
        return rentalService.findAll();
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "getRentalById")
    public RentalDTOResp getRentalById(@WebParam(name = "rentalId") Integer rentalId) {
        return rentalService.findById(rentalId);
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "createNewRental")
    public RentalDTOResp createRental(@WebParam(name = "rental") RentalDTOReq rental) {
        rental.setRentalDate(Instant.now());
        rental.setReturnDate(Instant.now());
        rental.setLastUpdate(Instant.now());
        return rentalService.save(rental);
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "updateExistingRental")
    public RentalDTOResp updateRental(@WebParam(name = "id") Integer id, @WebParam(name = "rental") RentalDTOReq rental) throws Exception {
        rental.setRentalDate(Instant.now());
        rental.setReturnDate(Instant.now());
        rental.setLastUpdate(Instant.now());
        return rentalService.update(id, rental);
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "deleteRentalById")
    public RentalDTOResp deleteRentalById(@WebParam(name = "rentalId") Integer rentalId) throws Exception {
        return rentalService.deleteById(rentalId);
    }
}
