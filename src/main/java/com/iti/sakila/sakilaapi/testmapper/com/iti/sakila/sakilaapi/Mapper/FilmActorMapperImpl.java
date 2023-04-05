package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.FilmActorDto;
import com.iti.sakila.sakilaapi.entity.FilmActor;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class FilmActorMapperImpl implements FilmActorMapper {

    @Override
    public FilmActor toEntity(FilmActorDto filmActorDto) {
        if ( filmActorDto == null ) {
            return null;
        }

        FilmActor filmActor = new FilmActor();

        return filmActor;
    }

    @Override
    public FilmActorDto toDto(FilmActor filmActor) {
        if ( filmActor == null ) {
            return null;
        }

        FilmActorDto filmActorDto = new FilmActorDto();

        return filmActorDto;
    }

    @Override
    public FilmActor partialUpdate(FilmActorDto filmActorDto, FilmActor filmActor) {
        if ( filmActorDto == null ) {
            return filmActor;
        }

        return filmActor;
    }
}
