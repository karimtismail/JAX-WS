package com.iti.sakilaapi.repository.implementation;

import com.iti.sakilaapi.model.entity.Language;
import com.iti.sakilaapi.model.entity.Staff;
import com.iti.sakilaapi.repository.TransactionalEntityManager;
import com.iti.sakilaapi.repository.interfaces.LanguageRepository;
import com.iti.sakilaapi.repository.interfaces.StaffRepository;

public class LanguageRepositoryImpl extends BaseEntityRepositoryImpl<Language, Short> implements LanguageRepository {
    public LanguageRepositoryImpl() {
        super(new TransactionalEntityManager(), Language.class);
    }

}
