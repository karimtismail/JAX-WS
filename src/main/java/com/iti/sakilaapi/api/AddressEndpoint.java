package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.AddressDto;
import com.iti.sakilaapi.model.entity.Address;
import com.iti.sakilaapi.service.AddressService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class AddressEndpoint {
    private final AddressService addressService;

    public AddressEndpoint() {
        addressService = new AddressService();
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "getAllAddress")
    public List<AddressDto> getAllAddress() {
        return addressService.findAll();
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "getAddressById")
    public AddressDto getAddressById(@WebParam(name = "addressId") Short addressId) {
        return addressService.findById(addressId);
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "createAddress")
    public AddressDto createAddress(@WebParam(name = "address") Address address) {
        return addressService.save(address);
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "updateAddress")
    public AddressDto updateAddress(@WebParam(name = "address") Address address) {
        return addressService.update(address);
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "deleteAddressById")
    public AddressDto deleteAddressById(@WebParam(name = "addressId") Short addressId) {
        return addressService.deleteById(addressId);
    }
}
