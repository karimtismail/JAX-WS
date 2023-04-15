package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.StoreDto;
import com.iti.sakilaapi.model.entity.Store;
import com.iti.sakilaapi.service.StoreService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class StoreEndPoint {
    private final StoreService storeService;

    public StoreEndPoint() {
        storeService = new StoreService(Store.class, StoreDto.class);
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "getAllStore")
    public List<StoreDto> getStoreList() {
        return storeService.findAll();
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "getStoreById")
    public StoreDto getStoreById(@WebParam(name = "storeId") Short storeId) {
        return storeService.findById(storeId);
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "createNewStore")
    public StoreDto createStore(@WebParam(name = "store") Store store) {
        return storeService.save(store);
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "updateExistingStore")
    public StoreDto updateStore(@WebParam(name = "store") Store store) {
        return storeService.update(store);
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "deleteStoreById")
    public StoreDto deleteStoreById(@WebParam(name = "storeId") Short storeId) {
        return storeService.deleteById(storeId);
    }
}
