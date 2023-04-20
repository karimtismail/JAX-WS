package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.CategoryDTOReq;
import com.iti.sakilaapi.model.dto.response.CategoryDTOResp;
import com.iti.sakilaapi.service.CategoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class CategoryEndpoint {
    private final CategoryService categoryService;

    public CategoryEndpoint() {
        categoryService = new CategoryService();
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "getAllCategory")
    public List<CategoryDTOResp> getCategoryList() {
        return categoryService.findAll();
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "getCategoryById")
    public CategoryDTOResp getCategoryById(@WebParam(name = "categoryId") Integer categoryId) {
        return categoryService.findById(categoryId);
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "createCategory")
    public CategoryDTOResp createCategory(@WebParam(name = "category") CategoryDTOReq category) {
        category.setLastUpdate(Instant.now());
        return categoryService.save(category);
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "updateCategory")
    public CategoryDTOResp updateCategory(@WebParam(name = "id") Integer id, @WebParam(name = "category") CategoryDTOReq category) throws Exception {
        category.setLastUpdate(Instant.now());
        return categoryService.update(id, category);
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "deleteCategoryById")
    public CategoryDTOResp deleteCategoryById(@WebParam(name = "categoryId") Integer categoryId) throws Exception {
        return categoryService.deleteById(categoryId);
    }
}
