package dev.camilo.graphqlpagination.event;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class EventController {

  private final EventRepository eventRepository;

  @QueryMapping
  List<Event> events(){
    return eventRepository.findAll();
  }

  @QueryMapping
  Optional<Event> event(@Argument Integer id){
    return eventRepository.findById(id);
  }


}