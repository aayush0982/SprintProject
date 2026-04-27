package com.sprint.Repository;

import com.sprint.Entities.Rental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "rentals", path = "rentals")
public interface RentalRepository extends JpaRepository<Rental, Long> {
}
