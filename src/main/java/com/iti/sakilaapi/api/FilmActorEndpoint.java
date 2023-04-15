package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.FilmActorDto;
import com.iti.sakilaapi.model.entity.FilmActor;
import com.iti.sakilaapi.service.FilmActorService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class FilmActorEndpoint {
    private final FilmActorService filmActorService;

    public FilmActorEndpoint() {
        filmActorService = new FilmActorService(FilmActor.class, FilmActorDto.class);
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "getAllFilmActor")
    public List<FilmActorDto> getAllFilmActor() {
        return filmActorService.findAll();
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "getFilmActorById")
    public FilmActorDto getFilmActorById(@WebParam(name = "filmActorId") Short filmActorId) {
        return filmActorService.findById(filmActorId);
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "createFilmActor")
    public FilmActorDto createFilmActor(@WebParam(name = "filmActor") FilmActor filmActor) {
        return filmActorService.save(filmActor);
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "updateFilmActor")
    public FilmActorDto updateFilmActor(@WebParam(name = "filmActor") FilmActor filmActor) {
        return filmActorService.update(filmActor);
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "deleteFilmActorById")
    public FilmActorDto deleteFilmActorById(@WebParam(name = "filmActorId") Short filmActorId) {
        return filmActorService.deleteById(filmActorId);
    }
}
