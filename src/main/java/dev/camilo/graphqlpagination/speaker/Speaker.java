package dev.camilo.graphqlpagination.speaker;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Speaker {

  @Id
  private Integer id;
  private String name;
  private String title;
  private String company;
  @Enumerated(EnumType.STRING)
  @Column(length = 10)
  private Gender gender;
  private String country;
  private String email;
  private String phoneNumber;
  private String twitter;
}
