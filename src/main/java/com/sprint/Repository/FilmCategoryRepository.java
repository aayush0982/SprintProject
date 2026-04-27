package com.sprint.Repository;

import com.sprint.Entities.FilmCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "filmCategories", path = "filmCategories")
public interface FilmCategoryRepository extends JpaRepository<FilmCategory, Long> {
}
