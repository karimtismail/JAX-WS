package com.iti.sakilaapi.service;

import com.iti.sakilaapi.model.dto.ActorDto;
import com.iti.sakilaapi.model.entity.Actor;

import java.util.List;

public class ActorService extends BaseService<Actor, Short, ActorDto> {
    public ActorService(Class<Actor> entityClass, Class<ActorDto> dtoClass) {
        super(entityClass, dtoClass);
    }

//    public ActorDto findActorById(Short actorId) {
//        return findById(actorId);
//    }
//
//    public List<ActorDto> findAllActors() {
//        return findAll();
//    }
//
//
//    public ActorDto saveActor(Actor actor) {
//        return save(actor);
//    }
//
//    public ActorDto update(Actor actor) {
//        Actor updatedActor = actorRepository.update(actor);
//        return modelMapper.map(updatedActor, ActorDto.class);
//    }
//
//    public ActorDto deleteById(Short actorId) {
//        Actor deleteActor = actorRepository.deleteById(actorId);
//        return modelMapper.map(deleteActor, ActorDto.class);
//    }
}