package com.iti.sakilaapi.model.dto;

import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@XmlRootElement
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto implements Serializable {
    private Short actorId;
    private String firstName;
    private String lastName;
    private Date lastUpdate;

    public ActorDto(Integer id, String firstName, String lastName, Date lastUpdate) {
    }
}