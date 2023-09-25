package dev.camilo.graphqlpagination.session;

import dev.camilo.graphqlpagination.event.Event;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
public class Session {

  @Id
  private Integer id;
  private String title;
  @Column(columnDefinition = "TEXT")
  private String description;
  @Enumerated(EnumType.STRING)
  private Level level;

  //tags relation
  @ManyToMany
  @JoinTable(
      name = "session_tags",
      joinColumns = @JoinColumn(name = "session_id"),
      inverseJoinColumns = @JoinColumn(name = "tag_id"))
  private Set<Tag> tags;

  //event relation inverse
  @ManyToOne
  private Event event;


  public Session() {
  }

  public Session(Integer id, String title, String description, Level level, Set<Tag> tags, Event event) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.level = level;
    this.tags = tags;
    this.event = event;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Level getLevel() {
    return level;
  }

  public void setLevel(Level level) {
    this.level = level;
  }

  public Set<Tag> getTags() {
    return tags;
  }

  public void setTags(Set<Tag> tags) {
    this.tags = tags;
  }

  public Event getEvent() {
    return event;
  }

  public void setEvent(Event event) {
    this.event = event;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Session{");
    sb.append("id=").append(id);
    sb.append(", title='").append(title).append('\'');
    sb.append(", description='").append(description).append('\'');
    sb.append(", level=").append(level);
    sb.append(", tags=").append(tags);
    sb.append(", event=").append(event);
    sb.append('}');
    return sb.toString();
  }
}
