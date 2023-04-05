package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.CityDto;
import com.iti.sakila.sakilaapi.entity.City;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class CityMapperImpl implements CityMapper {

    @Override
    public City toEntity(CityDto cityDto) {
        if ( cityDto == null ) {
            return null;
        }

        City city = new City();

        return city;
    }

    @Override
    public CityDto toDto(City city) {
        if ( city == null ) {
            return null;
        }

        CityDto cityDto = new CityDto();

        return cityDto;
    }

    @Override
    public City partialUpdate(CityDto cityDto, City city) {
        if ( cityDto == null ) {
            return city;
        }

        return city;
    }
}
