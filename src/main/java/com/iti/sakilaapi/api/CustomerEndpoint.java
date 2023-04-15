package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.CustomerDto;
import com.iti.sakilaapi.model.entity.Customer;
import com.iti.sakilaapi.service.CustomerService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CustomerEndpoint {
    private final CustomerService customerService;

    public CustomerEndpoint() {
        customerService = new CustomerService(Customer.class, CustomerDto.class);
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "getAllCustomer")
    public List<CustomerDto> getAllCustomer() {
        return customerService.findAll();
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "getCustomerById")
    public CustomerDto getCustomerById(@WebParam(name = "customerId") Short customerId) {
        return customerService.findById(customerId);
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "createCustomer")
    public CustomerDto createCustomer(@WebParam(name = "customer") Customer customer) {
        return customerService.save(customer);
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "updateCustomer")
    public CustomerDto updateCustomer(@WebParam(name = "customer") Customer customer) {
        return customerService.update(customer);
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "deleteCustomerById")
    public CustomerDto deleteCustomerById(@WebParam(name = "customerId") Short customerId) {
        return customerService.deleteById(customerId);
    }
}
