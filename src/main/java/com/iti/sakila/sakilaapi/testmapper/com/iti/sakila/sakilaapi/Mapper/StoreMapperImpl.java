package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.StoreDto;
import com.iti.sakila.sakilaapi.entity.Store;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class StoreMapperImpl implements StoreMapper {

    @Override
    public Store toEntity(StoreDto storeDto) {
        if ( storeDto == null ) {
            return null;
        }

        Store store = new Store();

        return store;
    }

    @Override
    public StoreDto toDto(Store store) {
        if ( store == null ) {
            return null;
        }

        StoreDto storeDto = new StoreDto();

        return storeDto;
    }

    @Override
    public Store partialUpdate(StoreDto storeDto, Store store) {
        if ( storeDto == null ) {
            return store;
        }

        return store;
    }
}
