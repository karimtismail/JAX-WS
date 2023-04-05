package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.LanguageDto;
import com.iti.sakila.sakilaapi.entity.Language;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class LanguageMapperImpl implements LanguageMapper {

    @Override
    public Language toEntity(LanguageDto languageDto) {
        if ( languageDto == null ) {
            return null;
        }

        Language language = new Language();

        return language;
    }

    @Override
    public LanguageDto toDto(Language language) {
        if ( language == null ) {
            return null;
        }

        LanguageDto languageDto = new LanguageDto();

        return languageDto;
    }

    @Override
    public Language partialUpdate(LanguageDto languageDto, Language language) {
        if ( languageDto == null ) {
            return language;
        }

        return language;
    }
}
