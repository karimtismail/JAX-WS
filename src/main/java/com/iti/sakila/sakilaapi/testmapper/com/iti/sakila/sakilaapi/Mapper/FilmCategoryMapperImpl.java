package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.FilmCategoryDto;
import com.iti.sakila.sakilaapi.entity.FilmCategory;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class FilmCategoryMapperImpl implements FilmCategoryMapper {

    @Override
    public FilmCategory toEntity(FilmCategoryDto filmCategoryDto) {
        if ( filmCategoryDto == null ) {
            return null;
        }

        FilmCategory filmCategory = new FilmCategory();

        return filmCategory;
    }

    @Override
    public FilmCategoryDto toDto(FilmCategory filmCategory) {
        if ( filmCategory == null ) {
            return null;
        }

        FilmCategoryDto filmCategoryDto = new FilmCategoryDto();

        return filmCategoryDto;
    }

    @Override
    public FilmCategory partialUpdate(FilmCategoryDto filmCategoryDto, FilmCategory filmCategory) {
        if ( filmCategoryDto == null ) {
            return filmCategory;
        }

        return filmCategory;
    }
}
