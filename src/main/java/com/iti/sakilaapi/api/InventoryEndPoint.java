package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.InventoryDTOReq;
import com.iti.sakilaapi.model.dto.response.InventoryDTOResp;
import com.iti.sakilaapi.service.InventoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class InventoryEndPoint {
    private final InventoryService inventoryService;

    public InventoryEndPoint() {
        inventoryService = new InventoryService();
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "getAllInventory")
    public List<InventoryDTOResp> getInventoryList() {
        return inventoryService.findAll();
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "getInventoryById")
    public InventoryDTOResp getInventoryById(@WebParam(name = "inventoryId") Integer inventoryId) {
        return inventoryService.findById(inventoryId);
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "createNewInventory")
    public InventoryDTOResp createInventory(@WebParam(name = "inventory") InventoryDTOReq inventory) {
        inventory.setLastUpdate(Instant.now());
        return inventoryService.save(inventory);
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "updateExistingInventory")
    public InventoryDTOResp updateInventory(@WebParam(name = "id") Integer id, @WebParam(name = "inventory") InventoryDTOReq inventory) throws Exception {
        inventory.setLastUpdate(Instant.now());
        return inventoryService.update(id, inventory);
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "deleteInventoryById")
    public InventoryDTOResp deleteInventoryById(@WebParam(name = "inventoryId") Integer inventoryId) throws Exception {
        return inventoryService.deleteById(inventoryId);
    }
}
