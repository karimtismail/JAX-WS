package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.AddressDto;
import com.iti.sakila.sakilaapi.entity.Address;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toEntity(AddressDto addressDto) {
        if ( addressDto == null ) {
            return null;
        }

        Address address = new Address();

        return address;
    }

    @Override
    public AddressDto toDto(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressDto addressDto = new AddressDto();

        return addressDto;
    }

    @Override
    public Address partialUpdate(AddressDto addressDto, Address address) {
        if ( addressDto == null ) {
            return address;
        }

        return address;
    }
}
