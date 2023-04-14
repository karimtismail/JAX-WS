package com.iti.sakilaapi;

import com.iti.sakilaapi.model.dto.ActorDto;
import com.iti.sakilaapi.model.entity.Actor;
import com.iti.sakilaapi.service.ActorService;

public class App {
    public static void main(String[] args) {

        ActorService actorService = new ActorService(Actor.class, ActorDto.class);
        for (ActorDto actorDto : actorService.findAll()) {
            System.out.println(actorDto);
        }

    }
}