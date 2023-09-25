package dev.camilo.graphqlpagination.session;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Tag {

  @Id
  private Integer id;
  private String name;
}
