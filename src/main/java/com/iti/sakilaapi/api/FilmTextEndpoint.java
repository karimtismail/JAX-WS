package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.FilmTextDTOReq;
import com.iti.sakilaapi.model.dto.response.FilmTextDTOResp;
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
        filmTextService = new FilmTextService();
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "getAllFilmText")
    public List<FilmTextDTOResp> getFilmTextList() {
        return filmTextService.findAll();
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "getFilmTextById")
    public FilmTextDTOResp getFilmTextById(@WebParam(name = "filmTextId") Integer filmTextId) {
        return filmTextService.findById(filmTextId);
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "createFilmText")
    public FilmTextDTOResp createFilmText(@WebParam(name = "filmText") FilmTextDTOReq filmText) {
        return filmTextService.save(filmText);
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "updateFilmText")
    public FilmTextDTOResp updateFilmText(@WebParam(name = "id") Integer id, @WebParam(name = "filmText") FilmTextDTOReq filmText) throws Exception {
        return filmTextService.update(id, filmText);
    }

    @WebResult(name = "FilmText")
    @WebMethod(operationName = "deleteFilmTextById")
    public FilmTextDTOResp deleteFilmTextById(@WebParam(name = "filmTextId") Integer filmTextId) throws Exception {
        return filmTextService.deleteById(filmTextId);
    }
}
