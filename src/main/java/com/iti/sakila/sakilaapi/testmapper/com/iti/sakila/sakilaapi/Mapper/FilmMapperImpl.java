package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.FilmDto;
import com.iti.sakila.sakilaapi.entity.Film;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class FilmMapperImpl implements FilmMapper {

    @Override
    public Film toEntity(FilmDto filmDto) {
        if ( filmDto == null ) {
            return null;
        }

        Film film = new Film();

        return film;
    }

    @Override
    public FilmDto toDto(Film film) {
        if ( film == null ) {
            return null;
        }

        FilmDto filmDto = new FilmDto();

        return filmDto;
    }

    @Override
    public Film partialUpdate(FilmDto filmDto, Film film) {
        if ( filmDto == null ) {
            return film;
        }

        return film;
    }
}
