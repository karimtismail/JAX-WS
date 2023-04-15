package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.FilmDto;
import com.iti.sakilaapi.model.entity.Film;
import com.iti.sakilaapi.service.FilmService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class FilmEndPoint {
    private final FilmService filmService;

    public FilmEndPoint() {
        filmService = new FilmService(Film.class, FilmDto.class);
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "getAllFilm")
    public List<FilmDto> getFilmList() {
        return filmService.findAll();
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "getFilmById")
    public FilmDto getFilmById(@WebParam(name = "filmId") Short filmId) {
        return filmService.findById(filmId);
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "createNewFilm")
    public FilmDto createFilm(@WebParam(name = "film") Film film) {
        return filmService.save(film);
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "updateExistingFilm")
    public FilmDto updateFilm(@WebParam(name = "film") Film film) {
        return filmService.update(film);
    }

    @WebResult(name = "Film")
    @WebMethod(operationName = "deleteFilmById")
    public FilmDto deleteFilmById(@WebParam(name = "filmId") Short filmId) {
        return filmService.deleteById(filmId);
    }
}
