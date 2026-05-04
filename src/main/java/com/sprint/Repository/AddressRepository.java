package com.sprint.Repository;

import com.sprint.Entities.Address;

import java.util.Optional;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "addresses", path = "addresses")
public interface AddressRepository extends JpaRepository<Address, Long> {
    @Override
    @EntityGraph(attributePaths = {"city", "city.country"})
    Optional<Address> findById(Long id);

    @EntityGraph(attributePaths = {"city", "city.country"})
    Optional<Address> findByAddressIgnoreCase(String address);
}
