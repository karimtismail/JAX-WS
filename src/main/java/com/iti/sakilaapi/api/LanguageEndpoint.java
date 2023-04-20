package com.iti.sakilaapi.api;

import com.iti.sakilaapi.model.dto.requests.LanguageDTOReq;
import com.iti.sakilaapi.model.dto.response.LanguageDTOResp;
import com.iti.sakilaapi.service.LanguageService;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

import java.time.Instant;
import java.util.List;

@WebService
public class LanguageEndpoint {
    private final LanguageService languageService;

    public LanguageEndpoint() {
        languageService = new LanguageService();
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "getAllLanguage")
    public List<LanguageDTOResp> getLanguageList() {
        return languageService.findAll();
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "getLanguageById")
    public LanguageDTOResp getLanguageById(@WebParam(name = "languageId") Integer languageId) {
        return languageService.findById(languageId);
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "createLanguage")
    public LanguageDTOResp createLanguage(@WebParam(name = "language") LanguageDTOReq language) {
        language.setLastUpdate(Instant.now());
        return languageService.save(language);
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "updateLanguage")
    public LanguageDTOResp updateLanguage(@WebParam(name = "id") Integer id, @WebParam(name = "language") LanguageDTOReq language) throws Exception {
        language.setLastUpdate(Instant.now());
        return languageService.update(id, language);
    }

    @WebResult(name = "Language")
    @WebMethod(operationName = "deleteLanguageById")
    public LanguageDTOResp deleteLanguageById(@WebParam(name = "languageId") Integer languageId) throws Exception {
        return languageService.deleteById(languageId);
    }
}
