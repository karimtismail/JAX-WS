package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.CityDto;
import com.iti.sakilaapi.model.entity.City;
import com.iti.sakilaapi.service.CityService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CityEndpoint {
    private final CityService cityService;

    public CityEndpoint() {
        cityService = new CityService(City.class, CityDto.class);
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "getAllCity")
    public List<CityDto> getCityList() {
        return cityService.findAll();
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "getCityById")
    public CityDto getCityById(@WebParam(name = "cityId") Short cityId) {
        return cityService.findById(cityId);
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "createCity")
    public CityDto createCity(@WebParam(name = "city") City city) {
        return cityService.save(city);
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "updateCity")
    public CityDto updateCity(@WebParam(name = "city") City city) {
        return cityService.update(city);
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "deleteCityById")
    public CityDto deleteCityById(@WebParam(name = "cityId") Short cityId) {
        return cityService.deleteById(cityId);
    }
}
