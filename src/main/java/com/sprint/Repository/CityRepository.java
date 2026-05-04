package com.sprint.Repository;

import com.sprint.Entities.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "cities", path = "cities")
public interface CityRepository extends JpaRepository<City, Long> {

	@Override
	@EntityGraph(attributePaths = "country")
	Page<City> findAll(Pageable pageable);
}
