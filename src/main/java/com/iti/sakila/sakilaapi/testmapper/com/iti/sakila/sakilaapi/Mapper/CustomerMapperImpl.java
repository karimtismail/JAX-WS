package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.CustomerDto;
import com.iti.sakila.sakilaapi.entity.Customer;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer toEntity(CustomerDto customerDto) {
        if ( customerDto == null ) {
            return null;
        }

        Customer customer = new Customer();

        return customer;
    }

    @Override
    public CustomerDto toDto(Customer customer) {
        if ( customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        return customerDto;
    }

    @Override
    public Customer partialUpdate(CustomerDto customerDto, Customer customer) {
        if ( customerDto == null ) {
            return customer;
        }

        return customer;
    }
}
