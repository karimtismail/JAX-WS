package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.ActorDto;
import com.iti.sakilaapi.model.entity.Actor;
import com.iti.sakilaapi.service.ActorService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class ActorEndpoint {
    private final ActorService actorService;

    public ActorEndpoint() {
        actorService = new ActorService(Actor.class, ActorDto.class);
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "getAllActors")
    public List<ActorDto> getAllActors() {
        return actorService.findAll();
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "getActorById")
    public ActorDto getActorById(@WebParam(name = "actorId") Short actorId) {
        return actorService.findById(actorId);
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "createActor")
    public ActorDto createActor(@WebParam(name = "actor") Actor actor) {
        return actorService.save(actor);
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "updateActor")
    public ActorDto updateActor(@WebParam(name = "actor") Actor actor) {
        return actorService.update(actor);
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "deleteActorById")
    public ActorDto deleteActorById(@WebParam(name = "actorId") Short actorId) {
        return actorService.deleteById(actorId);
    }
}
