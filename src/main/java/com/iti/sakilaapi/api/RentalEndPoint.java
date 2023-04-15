package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.RentalDto;
import com.iti.sakilaapi.model.entity.Rental;
import com.iti.sakilaapi.service.RentalService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class RentalEndPoint {
    private final RentalService rentalService;

    public RentalEndPoint() {
        rentalService = new RentalService(Rental.class, RentalDto.class);
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "getAllRental")
    public List<RentalDto> getAllRental() {
        return rentalService.findAll();
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "getRentalById")
    public RentalDto getRentalById(@WebParam(name = "rentalId") Short rentalId) {
        return rentalService.findById(rentalId);
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "createNewRental")
    public RentalDto createRental(@WebParam(name = "rental") Rental rental) {
        return rentalService.save(rental);
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "updateExistingRental")
    public RentalDto updateRental(@WebParam(name = "rental") Rental rental) {
        return rentalService.update(rental);
    }

    @WebResult(name = "Rental")
    @WebMethod(operationName = "deleteRentalById")
    public RentalDto deleteRentalById(@WebParam(name = "rentalId") Short rentalId) {
        return rentalService.deleteById(rentalId);
    }
}
