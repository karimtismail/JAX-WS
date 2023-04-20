package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.FilmCategoryDTOReq;
import com.iti.sakilaapi.model.dto.response.FilmCategoryDTOResp;
import com.iti.sakilaapi.service.FilmCategoryService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class FilmCategoryEndpoint {
    private final FilmCategoryService filmCategoryService;

    public FilmCategoryEndpoint() {
        filmCategoryService = new FilmCategoryService();
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "getAllFilmCategory")
    public List<FilmCategoryDTOResp> getFilmCategoryList() {
        return filmCategoryService.findAll();
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "getFilmCategoryById")
    public FilmCategoryDTOResp findFilmCategoryById(@WebParam(name = "filmCategoryId") Integer filmCategoryId) {
        return filmCategoryService.findById(filmCategoryId);
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "createNewFilmCategory")
    public FilmCategoryDTOResp createFilmCategory(@WebParam(name = "filmCategory") FilmCategoryDTOReq filmCategory) {
        filmCategory.setLastUpdate(Instant.now());
        return filmCategoryService.save(filmCategory);
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "updateExistingFilmCategory")
    public FilmCategoryDTOResp updateFilmCategory(@WebParam(name = "id") Integer id, @WebParam(name = "filmCategory") FilmCategoryDTOReq filmCategory) throws Exception {
        filmCategory.setLastUpdate(Instant.now());
        return filmCategoryService.update(id, filmCategory);
    }

    @WebResult(name = "FilmCategory")
    @WebMethod(operationName = "deleteFilmCategoryById")
    public FilmCategoryDTOResp removeFilmCategoryById(@WebParam(name = "filmCategoryId") Integer filmCategoryId) throws Exception {
        return filmCategoryService.deleteById(filmCategoryId);
    }
}
