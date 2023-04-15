package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.CategoryDto;
import com.iti.sakilaapi.model.entity.Category;
import com.iti.sakilaapi.service.CategoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class CategoryEndpoint {
    private final CategoryService categoryService;

    public CategoryEndpoint() {
        categoryService = new CategoryService(Category.class, CategoryDto.class);
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "getAllCategory")
    public List<CategoryDto> getCategoryList() {
        return categoryService.findAll();
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "getCategoryById")
    public CategoryDto getCategoryById(@WebParam(name = "categoryId") Short categoryId) {
        return categoryService.findById(categoryId);
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "createCategory")
    public CategoryDto createCategory(@WebParam(name = "category") Category category) {
        return categoryService.save(category);
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "updateCategory")
    public CategoryDto updateCategory(@WebParam(name = "category") Category category) {
        return categoryService.update(category);
    }

    @WebResult(name = "Category")
    @WebMethod(operationName = "deleteCategoryById")
    public CategoryDto deleteCategoryById(@WebParam(name = "categoryId") Short categoryId) {
        return categoryService.deleteById(categoryId);
    }
}
