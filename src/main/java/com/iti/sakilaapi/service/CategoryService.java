package com.iti.sakilaapi.service;

import com.iti.sakilaapi.dto.CategoryDto;
import com.iti.sakilaapi.entity.Category;
import com.iti.sakilaapi.repository.implementation.CategoryRepositoryImpl;
import com.iti.sakilaapi.repository.interfaces.CategoryRepository;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final ModelMapper modelMapper;

    /**
     * Constructs a new ActorService instance with a default ActorRepository implementation and a new ModelMapper instance.
     */
    public CategoryService() {
        this.categoryRepository = new CategoryRepositoryImpl();
        this.modelMapper = new ModelMapper();
    }

    public CategoryDto findById(Short categoryId) {
        Category category = categoryRepository.findById(categoryId);
        return modelMapper.map(category, CategoryDto.class);
    }

    public List<CategoryDto> findAll() {
        List<Category> categories = categoryRepository.findAll();
        List<CategoryDto> categoryDtos = new ArrayList<>();
        for (Category category : categories) {
            categoryDtos.add(modelMapper.map(category, CategoryDto.class));
        }
        return categoryDtos;
    }

    public CategoryDto save(Category category) {
        Category savedAddress = categoryRepository.save(category);
        return modelMapper.map(savedAddress, CategoryDto.class);
    }

    public CategoryDto update(Category category) {
        Category updatedAddress = categoryRepository.update(category);
        return modelMapper.map(updatedAddress, CategoryDto.class);
    }

    public CategoryDto deleteById(Short categoryId) {
        Category deleteAddress = categoryRepository.deleteById(categoryId);
        return modelMapper.map(deleteAddress, CategoryDto.class);
    }
}
