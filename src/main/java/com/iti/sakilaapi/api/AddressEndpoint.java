package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.AddressDTOReq;
import com.iti.sakilaapi.model.dto.response.AddressDTOResp;
import com.iti.sakilaapi.service.AddressService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class AddressEndpoint {
    private final AddressService addressService;

    public AddressEndpoint() {
        addressService = new AddressService();
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "getAllAddress")
    public List<AddressDTOResp> getAddressList() {
        return addressService.findAll();
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "getAddressById")
    public AddressDTOResp getAddressById(@WebParam(name = "addressId") Integer addressId) {
        return addressService.findById(addressId);
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "createAddress")
    public AddressDTOResp createAddress(@WebParam(name = "address") AddressDTOReq address) {
        address.setLastUpdate(Instant.now());
        return addressService.save(address);
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "updateAddress")
    public AddressDTOResp updateAddress(@WebParam(name = "addressId") Integer addressId, @WebParam(name = "address") AddressDTOReq address) throws Exception {
        address.setLastUpdate(Instant.now());
        return addressService.update(addressId, address);
    }

    @WebResult(name = "Address")
    @WebMethod(operationName = "deleteAddressById")
    public AddressDTOResp deleteAddressById(@WebParam(name = "addressId") Integer addressId) throws Exception {
        return addressService.deleteById(addressId);
    }
}
