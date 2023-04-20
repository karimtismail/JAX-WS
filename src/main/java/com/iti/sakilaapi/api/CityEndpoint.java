package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.CityDTOReq;
import com.iti.sakilaapi.model.dto.response.CityDTOResp;
import com.iti.sakilaapi.service.CityService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class CityEndpoint {
    private final CityService cityService;

    public CityEndpoint() {
        cityService = new CityService();
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "getAllCity")
    public List<CityDTOResp> getCityList() {
        return cityService.findAll();
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "getCityById")
    public CityDTOResp getCityById(@WebParam(name = "cityId") Integer cityId) {
        return cityService.findById(cityId);
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "createCity")
    public CityDTOResp createCity(@WebParam(name = "city") CityDTOReq city) {
        city.setLastUpdate(Instant.now());
        return cityService.save(city);
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "updateCity")
    public CityDTOResp updateCity(@WebParam(name = "id") Integer id, @WebParam(name = "city") CityDTOReq city) throws Exception {
        city.setLastUpdate(Instant.now());
        return cityService.update(id, city);
    }

    @WebResult(name = "City")
    @WebMethod(operationName = "deleteCityById")
    public CityDTOResp deleteCityById(@WebParam(name = "cityId") Integer cityId) throws Exception {
        return cityService.deleteById(cityId);
    }
}
