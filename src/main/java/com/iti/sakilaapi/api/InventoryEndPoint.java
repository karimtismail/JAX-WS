package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.InventoryDto;
import com.iti.sakilaapi.model.entity.Inventory;
import com.iti.sakilaapi.service.InventoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class InventoryEndPoint {
    private final InventoryService inventoryService;

    public InventoryEndPoint() {
        inventoryService = new InventoryService(Inventory.class, InventoryDto.class);
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "getAllInventory")
    public List<InventoryDto> getInventoryList() {
        return inventoryService.findAll();
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "getInventoryById")
    public InventoryDto getInventoryById(@WebParam(name = "inventoryId") Short inventoryId) {
        return inventoryService.findById(inventoryId);
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "createNewInventory")
    public InventoryDto createInventory(@WebParam(name = "inventory") Inventory inventory) {
        return inventoryService.save(inventory);
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "updateExistingInventory")
    public InventoryDto updateInventory(@WebParam(name = "inventory") Inventory inventory) {
        return inventoryService.update(inventory);
    }

    @WebResult(name = "Inventory")
    @WebMethod(operationName = "deleteInventoryById")
    public InventoryDto deleteInventoryById(@WebParam(name = "inventoryId") Short inventoryId) {
        return inventoryService.deleteById(inventoryId);
    }
}
