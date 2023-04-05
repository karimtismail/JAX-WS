package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.ActorDto;
import com.iti.sakila.sakilaapi.entity.Actor;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface ActorMapper {
    Actor toEntity(ActorDto actorDto);

    ActorDto toDto(Actor actor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Actor partialUpdate(ActorDto actorDto, @MappingTarget Actor actor);

    Actor toEntity1(com.iti.sakila.sakilaapi.Mapper.ActorDto actorDto);

    com.iti.sakila.sakilaapi.Mapper.ActorDto toDto1(Actor actor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Actor partialUpdate1(com.iti.sakila.sakilaapi.Mapper.ActorDto actorDto, @MappingTarget Actor actor);
}