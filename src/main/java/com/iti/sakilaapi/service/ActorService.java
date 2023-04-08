package com.iti.sakilaapi.service;

import com.iti.sakilaapi.entity.Actor;
import com.iti.sakilaapi.repository.implementation.ActorRepositoryImpl;
import com.iti.sakilaapi.repository.interfaces.ActorRepository;

import java.util.List;

public class ActorService {
    private final ActorRepository actorRepository = new ActorRepositoryImpl();

    public Actor findById(Short actorId) {
        return actorRepository.findById(actorId);
    }

    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    public Actor update(Actor actor) {
        return actorRepository.update(actor);
    }

    public boolean deleteById(Short actorId) {
        return actorRepository.deleteById(actorId);
    }

}
