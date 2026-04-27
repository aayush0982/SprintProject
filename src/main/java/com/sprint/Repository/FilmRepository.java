package com.sprint.Repository;

import com.sprint.Entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "films", path = "films")
public interface FilmRepository extends JpaRepository<Film, Long> {
}
