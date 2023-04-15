package com.iti.sakilaapi;

import com.iti.sakilaapi.api.ActorEndpoint;
import com.iti.sakilaapi.model.dto.ActorDto;
import com.iti.sakilaapi.model.entity.Actor;
import com.iti.sakilaapi.service.ActorService;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ActorEndpointTest {
//    ActorService actorService = new ActorService(Actor.class, ActorDto.class);
//    private final int counter = actorService.findAll().size() + 1;
//    private final Date date = new Date();
//
//    @Test
//    public void testGetAllActors() {
//        // Get the expected result by calling the findAll() method on the actorService instance
//        List<ActorDto> expected = actorService.findAll();
//
//        // Create an instance of the ActorEndpoint class with the actual actorService instance
//        ActorEndpoint actorEndpoint = new ActorEndpoint();
//
//        // Call the getAllActors() method on the actorEndpoint instance
//        List<ActorDto> actual = actorEndpoint.getAllActors();
//
//        // Verify that the expected and actual results match
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void testGetActorById() {
//        // Set the ID of the actor to be retrieved
//        short id = 3;
//
//        // Get the expected result by calling the findById() method on the actorService instance
//        ActorDto expected = actorService.findById(id);
//
//        // Create an instance of the ActorEndpoint class with the actual actorService instance
//        ActorEndpoint actorEndpoint = new ActorEndpoint();
//
//        // Call the getActorById() method on the actorEndpoint instance with the specified ID
//        ActorDto actual = actorEndpoint.getActorById(id);
//
//        // Verify that the expected and actual results match
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void testCreateActor() {
//        // Create an instance of the ActorEndpoint class with the actual actorService instance
//        ActorEndpoint actorEndpoint = new ActorEndpoint();
//
//        // Create a new Actor object
//        Actor actor = new Actor("Karim" + counter, "Taha" + counter, date);
//
//        // Call the createActor() method on the actorEndpoint instance
//        ActorDto actual = actorEndpoint.createActor(actor);
//
//        // Verify that the actual result has a non-null actorId
//        assertNotNull(actual.getActorId());
//
//        // Create the expected result with the same actorId as the actual result
//        ActorDto expected = new ActorDto(actual.getActorId(), "Karim" + counter, "Taha" + counter, date);
//
//        // Verify that the expected and actual results match
//        assertEquals(expected, actual);
//    }


//    @Test
//    public void testUpdateActor() {
//        actorService = new ActorService(Actor.class, ActorDto.class);
//
//        // Create an instance of the ActorEndpoint class with the actual actorService instance
//        ActorEndpoint actorEndpoint = new ActorEndpoint();
//
//        // Create a new Actor object
//        Actor actor = new Actor("Karim" + counter, "Taha" + counter, date);
//        actorService.save(actor);
//
//        // Modify the Actor object and create the expected result
//        actor.setFirstName("Karim_updated");
//        actor.setLastName("Taha_updated");
//        ActorDto expected = new ActorDto(actor.getId(), actor.getFirstName(), actor.getLastName(), actor.getLastUpdate());
//
//        // Call the updateActor() method on the actorEndpoint instance
//        ActorDto actual = actorEndpoint.updateActor(new Actor(actor.getId(), actor.getFirstName(), actor.getLastName(), actor.getLastUpdate()));
//
//        // Verify that the expected and actual results match
//        assertEquals(expected, actual);
//    }

//    @Test
//    public void testDeleteActorById() {
//        ActorDto expected = new ActorDto(1, "John", "Doe");
//        when(actorService.deleteById(ArgumentMatchers.anyShort())).thenReturn(expected);
//
//        ActorDto actual = actorEndpoint.deleteActorById((short) 1);
//
//        assertEquals(expected, actual);
//    }
}