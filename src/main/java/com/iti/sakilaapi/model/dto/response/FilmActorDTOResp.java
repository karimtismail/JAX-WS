package com.iti.sakilaapi.model.dto.response;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class FilmActorDTOResp implements Serializable {
    private FilmActorIdDTOResp id;
    private ActorDTOResp actor;
    private FilmDTOResp film;
    private Instant lastUpdate;
}
