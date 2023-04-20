package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.CustomerDTOReq;
import com.iti.sakilaapi.model.dto.response.CustomerDTOResp;
import com.iti.sakilaapi.service.CustomerService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class CustomerEndpoint {
    private final CustomerService customerService;

    public CustomerEndpoint() {
        customerService = new CustomerService();
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "getAllCustomer")
    public List<CustomerDTOResp> getCustomerList() {
        return customerService.findAll();
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "getCustomerById")
    public CustomerDTOResp getCustomerById(@WebParam(name = "customerId") Integer customerId) {
        return customerService.findById(customerId);
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "createCustomer")
    public CustomerDTOResp createCustomer(@WebParam(name = "customer") CustomerDTOReq customer) {
        customer.setLastUpdate(Instant.now());
        customer.setCreateDate(Instant.now());
        return customerService.save(customer);
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "updateCustomer")
    public CustomerDTOResp updateCustomer(@WebParam(name = "id") Integer id, @WebParam(name = "customer") CustomerDTOReq customer) throws Exception {
        customer.setLastUpdate(Instant.now());
        customer.setCreateDate(Instant.now());
        return customerService.update(id, customer);
    }

    @WebResult(name = "Customer")
    @WebMethod(operationName = "deleteCustomerById")
    public CustomerDTOResp deleteCustomerById(@WebParam(name = "customerId") Integer customerId) throws Exception {
        return customerService.deleteById(customerId);
    }
}
