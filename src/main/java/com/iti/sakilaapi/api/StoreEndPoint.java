package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.StoreDTOReq;
import com.iti.sakilaapi.model.dto.response.StoreDTOResp;
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
        storeService = new StoreService();
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "getAllStore")
    public List<StoreDTOResp> getStoreList() {
        return storeService.findAll();
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "getStoreById")
    public StoreDTOResp getStoreById(@WebParam(name = "storeId") Integer storeId) {
        return storeService.findById(storeId);
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "createNewStore")
    public StoreDTOResp createStore(@WebParam(name = "store") StoreDTOReq store) {
        return storeService.save(store);
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "updateExistingStore")
    public StoreDTOResp updateStore(@WebParam(name = "id") Integer id, @WebParam(name = "store") StoreDTOReq store) throws Exception {
        return storeService.update(id, store);
    }

    @WebResult(name = "Store")
    @WebMethod(operationName = "deleteStoreById")
    public StoreDTOResp deleteStoreById(@WebParam(name = "storeId") Integer storeId) throws Exception {
        return storeService.deleteById(storeId);
    }
}
