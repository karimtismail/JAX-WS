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
public class ActorDTOResp implements Serializable {
    private Integer id;
    private String firstName;
    private String lastName;
    private Instant lastUpdate;

    public ActorDTOResp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public ActorDTOResp(Integer id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }
}
