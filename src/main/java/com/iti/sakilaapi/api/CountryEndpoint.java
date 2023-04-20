package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.CountryDTOReq;
import com.iti.sakilaapi.model.dto.response.CountryDTOResp;
import com.iti.sakilaapi.service.CountryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class CountryEndpoint {
    private final CountryService countryService;

    public CountryEndpoint() {
        countryService = new CountryService();
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "getAllCountry")
    public List<CountryDTOResp> getCountryList() {
        return countryService.findAll();
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "getCountryById")
    public CountryDTOResp getCountryById(@WebParam(name = "countryId") Integer countryId) {
        return countryService.findById(countryId);
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "createCountry")
    public CountryDTOResp createCountry(@WebParam(name = "country") CountryDTOReq country) {
        country.setLastUpdate(Instant.now());
        return countryService.save(country);
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "updateCountry")
    public CountryDTOResp updateCountry(@WebParam(name = "id") Integer id, @WebParam(name = "country") CountryDTOReq country) throws Exception {
        country.setLastUpdate(Instant.now());
        return countryService.update(id, country);
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "deleteCountryById")
    public CountryDTOResp deleteCountryById(@WebParam(name = "countryId") Integer countryId) throws Exception {
        return countryService.deleteById(countryId);
    }
}
