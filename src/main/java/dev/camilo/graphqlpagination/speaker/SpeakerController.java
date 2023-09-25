package dev.camilo.graphqlpagination.speaker;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class SpeakerController {

  private final SpeakerRepository speakerRepository;

  @QueryMapping
  List<Speaker> speakers(){
    return speakerRepository.findAll();
  }

  @QueryMapping
  Optional<Speaker> speaker(@Argument Integer id){
    return speakerRepository.findById(id);
  }
}
