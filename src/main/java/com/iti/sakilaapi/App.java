package com.iti.sakilaapi;

import com.iti.sakilaapi.model.dto.FilmDto;
import com.iti.sakilaapi.model.dto.StoreDto;
import com.iti.sakilaapi.model.entity.Film;
import com.iti.sakilaapi.model.entity.Store;
import com.iti.sakilaapi.service.FilmService;
import com.iti.sakilaapi.service.StoreService;

public class App {
    public static void main(String[] args) {
        FilmService service = new FilmService(Film.class, FilmDto.class);
        for (FilmDto storeDto : service.findAll()) {
            System.out.println(storeDto.getDescription());
        }
    }
}