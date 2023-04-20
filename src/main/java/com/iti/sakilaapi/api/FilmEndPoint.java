package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.FilmDTOReq;
import com.iti.sakilaapi.model.dto.response.FilmDTOResp;
import com.iti.sakilaapi.service.FilmService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class FilmEndPoint {
    private final FilmService filmService;

    public FilmEndPoint() {
        filmService = new FilmService();
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "getAllFilm")
    public List<FilmDTOResp> getFilmList() {
        return filmService.findAll();
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "getFilmById")
    public FilmDTOResp getFilmById(@WebParam(name = "filmId") Integer filmId) {
        return filmService.findById(filmId);
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "createNewFilm")
    public FilmDTOResp createFilm(@WebParam(name = "film") FilmDTOReq film) {
        film.setLastUpdate(Instant.now());
        return filmService.save(film);
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "updateExistingFilm")
    public FilmDTOResp updateFilm(@WebParam(name = "id") Integer id, @WebParam(name = "film") FilmDTOReq film) throws Exception {
        film.setLastUpdate(Instant.now());
        return filmService.update(id, film);
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "deleteFilmById")
    public FilmDTOResp deleteFilmById(@WebParam(name = "filmId") Integer filmId) throws Exception {
        return filmService.deleteById(filmId);
    }
}
