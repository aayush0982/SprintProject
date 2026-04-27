package com.sprint.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sprint.Entities.Store;

@RepositoryRestResource(collectionResourceRel = "stores", path = "stores")
public interface StoreRepository extends JpaRepository<Store, Long> {
}
