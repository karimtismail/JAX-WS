package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.FilmTextDto;
import com.iti.sakila.sakilaapi.entity.FilmText;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class FilmTextMapperImpl implements FilmTextMapper {

    @Override
    public FilmText toEntity(FilmTextDto filmTextDto) {
        if ( filmTextDto == null ) {
            return null;
        }

        FilmText filmText = new FilmText();

        return filmText;
    }

    @Override
    public FilmTextDto toDto(FilmText filmText) {
        if ( filmText == null ) {
            return null;
        }

        FilmTextDto filmTextDto = new FilmTextDto();

        return filmTextDto;
    }

    @Override
    public FilmText partialUpdate(FilmTextDto filmTextDto, FilmText filmText) {
        if ( filmTextDto == null ) {
            return filmText;
        }

        return filmText;
    }
}
