package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.RentalDto;
import com.iti.sakila.sakilaapi.entity.Rental;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class RentalMapperImpl implements RentalMapper {

    @Override
    public Rental toEntity(RentalDto rentalDto) {
        if ( rentalDto == null ) {
            return null;
        }

        Rental rental = new Rental();

        return rental;
    }

    @Override
    public RentalDto toDto(Rental rental) {
        if ( rental == null ) {
            return null;
        }

        RentalDto rentalDto = new RentalDto();

        return rentalDto;
    }

    @Override
    public Rental partialUpdate(RentalDto rentalDto, Rental rental) {
        if ( rentalDto == null ) {
            return rental;
        }

        return rental;
    }
}
