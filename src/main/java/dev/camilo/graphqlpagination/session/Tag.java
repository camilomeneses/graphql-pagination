package dev.camilo.graphqlpagination.session;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
public class Tag {

  @Id
  @GeneratedValue
  private Integer id;
  private String name;

  public Tag() {}

  public Tag(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Tag{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}
