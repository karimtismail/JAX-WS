package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.FilmActorDto;
import com.iti.sakila.sakilaapi.entity.FilmActor;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.CDI)
public interface FilmActorMapper {
    FilmActor toEntity(FilmActorDto filmActorDto);

    FilmActorDto toDto(FilmActor filmActor);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    FilmActor partialUpdate(FilmActorDto filmActorDto, @MappingTarget FilmActor filmActor);
}