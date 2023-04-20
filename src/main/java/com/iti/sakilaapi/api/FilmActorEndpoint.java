package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.FilmActorDTOReq;
import com.iti.sakilaapi.model.dto.response.FilmActorDTOResp;
import com.iti.sakilaapi.service.FilmActorService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class FilmActorEndpoint {
    private final FilmActorService filmActorService;

    public FilmActorEndpoint() {
        filmActorService = new FilmActorService();
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "getAllFilmActor")
    public List<FilmActorDTOResp> getFilmActorList() {
        return filmActorService.findAll();
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "getFilmActorById")
    public FilmActorDTOResp findFilmActorById(@WebParam(name = "filmActorId") Integer filmActorId) {
        return filmActorService.findById(filmActorId);
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "createFilmActor")
    public FilmActorDTOResp saveFilmActor(@WebParam(name = "filmActor") FilmActorDTOReq filmActor) {
        filmActor.setLastUpdate(Instant.now());
        return filmActorService.save(filmActor);
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "updateFilmActor")
    public FilmActorDTOResp modifyFilmActor(@WebParam(name = "id") Integer id, @WebParam(name = "filmActor") FilmActorDTOReq filmActor) throws Exception {
        filmActor.setLastUpdate(Instant.now());
        return filmActorService.update(id, filmActor);
    }

    @WebResult(name = "FilmActor")
    @WebMethod(operationName = "deleteFilmActorById")
    public FilmActorDTOResp removeFilmActorById(@WebParam(name = "filmActorId") Integer filmActorId) throws Exception {
        return filmActorService.deleteById(filmActorId);
    }
}
