package dev.camilo.graphqlpagination.event;

import dev.camilo.graphqlpagination.session.Session;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Event {

  @Id
  private Integer id;
  private String name;
  @Column(columnDefinition = "TEXT")
  private String description;
  private LocalDate startDate;
  private LocalDate endDate;
  private LocalDate cfpStartDate;
  private LocalDate cfpEndDate;
  private String location;
  private String website;

  //sessions relation
  @OneToMany(cascade = CascadeType.ALL, mappedBy = "event")
  private Set<Session> sessions = new HashSet<>();
}
