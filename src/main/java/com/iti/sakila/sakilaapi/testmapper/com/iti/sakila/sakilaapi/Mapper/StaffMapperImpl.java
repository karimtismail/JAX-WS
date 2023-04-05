package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.StaffDto;
import com.iti.sakila.sakilaapi.entity.Staff;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class StaffMapperImpl implements StaffMapper {

    @Override
    public Staff toEntity(StaffDto staffDto) {
        if ( staffDto == null ) {
            return null;
        }

        Staff staff = new Staff();

        return staff;
    }

    @Override
    public StaffDto toDto(Staff staff) {
        if ( staff == null ) {
            return null;
        }

        StaffDto staffDto = new StaffDto();

        return staffDto;
    }

    @Override
    public Staff partialUpdate(StaffDto staffDto, Staff staff) {
        if ( staffDto == null ) {
            return staff;
        }

        return staff;
    }
}
