package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.ActorDTOReq;
import com.iti.sakilaapi.model.dto.response.ActorDTOResp;
import com.iti.sakilaapi.service.ActorService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class ActorEndpoint {
    private final ActorService actorService = new ActorService();

    public ActorEndpoint() {
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "getAllActors")
    public List<ActorDTOResp> getActorsList() {
        return actorService.findAll();
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "getActorById")
    public ActorDTOResp getActorById(@WebParam(name = "actorId") Integer actorId) {
        return actorService.findById(actorId);
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "createNewActor")
    public ActorDTOResp createActor(@WebParam(name = "actor") ActorDTOReq actor) {
        actor.setLastUpdate(Instant.now());
        return actorService.save(actor);
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "updateExistingActor")
    public ActorDTOResp updateActor(@WebParam(name = "actorId") Integer actorId, @WebParam(name = "actor") ActorDTOReq actor) throws Exception {
        actor.setLastUpdate(Instant.now());
        return actorService.update(actorId, actor);
    }

    @WebResult(name = "Actor")
    @WebMethod(operationName = "deleteActorById")
    public ActorDTOResp deleteActorById(@WebParam(name = "actorId") Integer actorId) throws Exception {
        return actorService.deleteById(actorId);
    }
}
