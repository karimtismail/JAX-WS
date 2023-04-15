package com.iti.sakilaapi.repository.implementation;

import com.iti.sakilaapi.model.entity.Rental;
import com.iti.sakilaapi.model.entity.Store;
import com.iti.sakilaapi.repository.TransactionalEntityManager;
import com.iti.sakilaapi.repository.interfaces.RentalRepository;
import com.iti.sakilaapi.repository.interfaces.StoreRepository;

public class RentalRepositoryImpl extends BaseEntityRepositoryImpl<Rental, Short> implements RentalRepository {
    public RentalRepositoryImpl() {
        super(new TransactionalEntityManager(), Rental.class);
    }

}
