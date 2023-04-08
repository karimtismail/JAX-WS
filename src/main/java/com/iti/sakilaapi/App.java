package com.iti.sakilaapi;

import com.iti.sakilaapi.entity.Actor;
import com.iti.sakilaapi.service.ActorService;

public class App {
    public static void main(String[] args) {
        ActorService actorService = new ActorService();
        for (Actor actor14 : actorService.findAll()) {
            System.out.println(actor14.getFirstName());
        }
    }
}