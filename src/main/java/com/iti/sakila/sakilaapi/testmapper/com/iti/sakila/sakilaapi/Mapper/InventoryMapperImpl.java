package com.iti.sakila.sakilaapi.Mapper;

import com.iti.sakila.sakilaapi.dto.InventoryDto;
import com.iti.sakila.sakilaapi.entity.Inventory;
import javax.annotation.processing.Generated;
import javax.enterprise.context.ApplicationScoped;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 17.0.5 (Oracle Corporation)"
)
@ApplicationScoped
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public Inventory toEntity(InventoryDto inventoryDto) {
        if ( inventoryDto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        return inventory;
    }

    @Override
    public InventoryDto toDto(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        InventoryDto inventoryDto = new InventoryDto();

        return inventoryDto;
    }

    @Override
    public Inventory partialUpdate(InventoryDto inventoryDto, Inventory inventory) {
        if ( inventoryDto == null ) {
            return inventory;
        }

        return inventory;
    }
}
