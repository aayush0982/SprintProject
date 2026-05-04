package com.sprint.Repository;

import com.sprint.Entities.Customer;
import com.sprint.Projections.CustomerProjection;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import jakarta.validation.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

@RepositoryRestResource(collectionResourceRel = "customers", path = "customers", excerptProjection = CustomerProjection.class)
@Validated
public interface CustomerRepository extends JpaRepository<Customer, Long> {

        @Override
        @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = {
                        "address",
                        "address.city",
                        "address.city.country",
                        "store",
                        "store.address",
                        "store.address.city",
                        "store.address.city.country",
                        "store.managerStaff",
                        "store.managerStaff.address",
                        "store.managerStaff.address.city",
                        "store.managerStaff.address.city.country",
                        "rentals",
                        "rentals.inventory",
                        "rentals.inventory.film",
                        "rentals.inventory.film.language",
                        "rentals.inventory.film.originalLanguage"
        })
        Optional<Customer> findById(Long id);

    @Override
    @RestResource(exported = false)
    void deleteById(Long id);

    @Override
    @RestResource(exported = false)
    void delete(Customer entity);

    Optional<Customer> findByEmail(@Param("email") String email);

    Page<Customer> findByActive(@Param("active") Boolean active, Pageable pageable);

    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = {
            "address",
            "address.city",
            "address.city.country"
    })
    Page<Customer> findByAddress_City_CityIgnoreCase(@Param("city") String city, Pageable pageable);

    @EntityGraph(type = EntityGraph.EntityGraphType.FETCH, attributePaths = {
            "address",
            "address.city",
            "address.city.country"
    })
    List<Customer> findByFirstNameAndLastName(
            @Param("firstName") @NotBlank String firstName,
            @Param("lastName") @NotBlank String lastName);
}
