package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.LanguageDto;
import com.iti.sakilaapi.model.entity.Language;
import com.iti.sakilaapi.service.LanguageService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public class LanguageEndpoint {
    private final LanguageService languageService;

    public LanguageEndpoint() {
        languageService = new LanguageService(Language.class, LanguageDto.class);
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "getAllLanguage")
    public List<LanguageDto> getAllLanguage() {
        return languageService.findAll();
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "getLanguageById")
    public LanguageDto getLanguageById(@WebParam(name = "languageId") Short languageId) {
        return languageService.findById(languageId);
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "createLanguage")
    public LanguageDto createLanguage(@WebParam(name = "language") Language language) {
        return languageService.save(language);
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "updateLanguage")
    public LanguageDto updateLanguage(@WebParam(name = "language") Language language) {
        return languageService.update(language);
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "deleteLanguageById")
    public LanguageDto deleteLanguageById(@WebParam(name = "languageId") Short languageId) {
        return languageService.deleteById(languageId);
    }
}
