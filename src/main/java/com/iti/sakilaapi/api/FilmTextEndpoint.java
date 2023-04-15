package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.FilmTextDto;
import com.iti.sakilaapi.model.entity.FilmText;
import com.iti.sakilaapi.service.FilmTextService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class FilmTextEndpoint {
    private final FilmTextService filmTextService;

    public FilmTextEndpoint() {
        filmTextService = new FilmTextService(FilmText.class, FilmTextDto.class);
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "getAllFilmText")
    public List<FilmTextDto> getFilmTextList() {
        return filmTextService.findAll();
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "getFilmTextById")
    public FilmTextDto getFilmTextById(@WebParam(name = "filmTextId") Short filmTextId) {
        return filmTextService.findById(filmTextId);
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "createFilmText")
    public FilmTextDto createFilmText(@WebParam(name = "filmText") FilmText filmText) {
        return filmTextService.save(filmText);
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "updateFilmText")
    public FilmTextDto updateFilmText(@WebParam(name = "filmText") FilmText filmText) {
        return filmTextService.update(filmText);
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "deleteFilmTextById")
    public FilmTextDto deleteFilmTextById(@WebParam(name = "filmTextId") Short filmTextId) {
        return filmTextService.deleteById(filmTextId);
    }
}
