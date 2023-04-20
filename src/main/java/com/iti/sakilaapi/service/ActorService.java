package com.iti.sakilaapi.service;

import com.iti.sakilaapi.model.dto.requests.ActorDTOReq;
import com.iti.sakilaapi.model.dto.response.ActorDTOResp;
import com.iti.sakilaapi.model.entity.Actor;

public class ActorService extends BaseService<Actor, Integer, ActorDTOReq, ActorDTOResp> {

    public ActorService() {
        super(Actor.class, ActorDTOReq.class, ActorDTOResp.class);
    }
}