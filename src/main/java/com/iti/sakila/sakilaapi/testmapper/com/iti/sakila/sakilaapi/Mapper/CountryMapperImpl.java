package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.CountryDto;
import com.iti.sakila.sakilaapi.entity.Country;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class CountryMapperImpl implements CountryMapper {

    @Override
    public Country toEntity(CountryDto countryDto) {
        if ( countryDto == null ) {
            return null;
        }

        Country country = new Country();

        return country;
    }

    @Override
    public CountryDto toDto(Country country) {
        if ( country == null ) {
            return null;
        }

        CountryDto countryDto = new CountryDto();

        return countryDto;
    }

    @Override
    public Country partialUpdate(CountryDto countryDto, Country country) {
        if ( countryDto == null ) {
            return country;
        }

        return country;
    }
}
