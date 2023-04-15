package com.iti.sakilaapi;

import com.iti.sakilaapi.model.dto.FilmActorDto;
import com.iti.sakilaapi.model.dto.FilmDto;
import com.iti.sakilaapi.model.dto.FilmTextDto;
import com.iti.sakilaapi.model.dto.StoreDto;
import com.iti.sakilaapi.model.entity.Film;
import com.iti.sakilaapi.model.entity.FilmActor;
import com.iti.sakilaapi.model.entity.FilmText;
import com.iti.sakilaapi.model.entity.Store;
import com.iti.sakilaapi.service.FilmActorService;
import com.iti.sakilaapi.service.FilmService;
import com.iti.sakilaapi.service.FilmTextService;
import com.iti.sakilaapi.service.StoreService;

public class App {
    public static void main(String[] args) {
        FilmTextService service = new FilmTextService(FilmText.class, FilmTextDto.class);
        for (FilmTextDto storeDto : service.findAll()) {
            System.out.println(storeDto.getDescription());
        }
    }
}