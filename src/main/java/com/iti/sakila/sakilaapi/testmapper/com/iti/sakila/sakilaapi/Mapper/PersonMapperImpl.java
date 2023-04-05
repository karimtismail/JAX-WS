package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.PersonDto;
import com.iti.sakila.sakilaapi.entity.Person;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class PersonMapperImpl implements PersonMapper {

    @Override
    public Person toEntity(PersonDto personDto) {
        if ( personDto == null ) {
            return null;
        }

        Person person = new Person();

        return person;
    }

    @Override
    public PersonDto toDto(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonDto personDto = new PersonDto();

        return personDto;
    }

    @Override
    public Person partialUpdate(PersonDto personDto, Person person) {
        if ( personDto == null ) {
            return person;
        }

        return person;
    }
}
