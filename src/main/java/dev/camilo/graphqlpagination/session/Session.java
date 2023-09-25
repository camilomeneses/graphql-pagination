package dev.camilo.graphqlpagination.session;

import dev.camilo.graphqlpagination.event.Event;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Session {

  @Id
  private Integer id;
  private String title;
  @Column(columnDefinition = "TEXT")
  private String description;
  @Enumerated(EnumType.STRING)
  private Level level;

  //tags relation
  @OneToMany
  private Set<Tag> tags;

  //event relation inverse
  @ManyToOne
  private Event event;

}
