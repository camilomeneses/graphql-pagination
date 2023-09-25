package dev.camilo.graphqlpagination.session;

import org.springframework.data.repository.ListCrudRepository;

public interface SessionRepository extends ListCrudRepository<Session, Integer> {
}
