package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.FilmCategoryDto;
import com.iti.sakilaapi.model.entity.FilmCategory;
import com.iti.sakilaapi.service.FilmCategoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class FilmCategoryEndpoint {
    private final FilmCategoryService filmCategoryService;

    public FilmCategoryEndpoint() {
        filmCategoryService = new FilmCategoryService(FilmCategory.class, FilmCategoryDto.class);
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "getAllFilmCategory")
    public List<FilmCategoryDto> getFilmCategoryList() {
        return filmCategoryService.findAll();
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "getFilmCategoryById")
    public FilmCategoryDto findFilmCategoryById(@WebParam(name = "filmCategoryId") Short filmCategoryId) {
        return filmCategoryService.findById(filmCategoryId);
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "createNewFilmCategory")
    public FilmCategoryDto createFilmCategory(@WebParam(name = "filmCategory") FilmCategory filmCategory) {
        return filmCategoryService.save(filmCategory);
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "updateExistingFilmCategory")
    public FilmCategoryDto updateFilmCategory(@WebParam(name = "filmCategory") FilmCategory filmCategory) {
        return filmCategoryService.update(filmCategory);
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "deleteFilmCategoryById")
    public FilmCategoryDto removeFilmCategoryById(@WebParam(name = "filmCategoryId") Short filmCategoryId) {
        return filmCategoryService.deleteById(filmCategoryId);
    }
}
