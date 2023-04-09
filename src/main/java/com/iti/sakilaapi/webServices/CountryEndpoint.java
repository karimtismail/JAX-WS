package com.iti.sakilaapi.webServices;

import com.iti.sakilaapi.dto.CountryDto;
import com.iti.sakilaapi.entity.Country;
import com.iti.sakilaapi.service.CountryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CountryEndpoint {
    private final CountryService countryService;

    public CountryEndpoint() {
        countryService = new CountryService();
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "getAllCountry")
    public List<CountryDto> getAllCountry() {
        return countryService.findAll();
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "getCountryById")
    public CountryDto getCountryById(@WebParam(name = "countryId") Short countryId) {
        return countryService.findById(countryId);
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "createCountry")
    public CountryDto createCountry(@WebParam(name = "country") Country country) {
        return countryService.save(country);
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "updateCountry")
    public CountryDto updateCountry(@WebParam(name = "country") Country country) {
        return countryService.update(country);
    }

    @WebResult(name = "Country")
    @WebMethod(operationName = "deleteCountryById")
    public CountryDto deleteCountryById(@WebParam(name = "countryId") Short countryId) {
        return countryService.deleteById(countryId);
    }
}
