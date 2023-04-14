package com.iti.sakilaapi.service;

import com.iti.sakilaapi.repository.TransactionalEntityManager;
import com.iti.sakilaapi.repository.implementation.BaseEntityRepositoryImpl;
import org.modelmapper.ModelMapper;

import java.util.ArrayList;
import java.util.List;

public class BaseService<T, ID, D> {

    private final BaseEntityRepositoryImpl<T, ID> repository;
    private final ModelMapper mapper;
    private final Class<D> dtoClass;

    public BaseService(Class<T> entityClass, Class<D> dtoClass) {
        this.dtoClass = dtoClass;
        this.repository = new BaseEntityRepositoryImpl<>(new TransactionalEntityManager(), entityClass);
        this.mapper = new ModelMapper();
    }

    public D findById(ID id) {
        T entity = repository.findById(id);
        return mapper.map(entity, dtoClass);
    }

    public List<D> findAll() {
        List<T> entities = repository.findAll();
        List<D> dto = new ArrayList<>();
        for (T entity : entities) {
            dto.add(mapper.map(entity, dtoClass));
        }
        return dto;
    }

    public D save(T entity) {
        T savedEntity = repository.save(entity);
        return mapper.map(savedEntity, dtoClass);
    }

    public D update(T entity) {
        T updatedEntity = repository.update(entity);
        return mapper.map(updatedEntity, dtoClass);
    }

    public D deleteById(ID id) {
        T deleteEntity = repository.deleteById(id);
        return mapper.map(deleteEntity, dtoClass);
    }
}