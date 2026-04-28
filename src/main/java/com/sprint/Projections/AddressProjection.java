package com.sprint.Projections;

import org.springframework.data.rest.core.config.Projection;
import com.sprint.Entities.Address;

// Nested projection — used inside CustomerProjection
// to flatten address fields directly into customer response
@Projection(name = "addressDetail", types = Address.class)
public interface AddressProjection {

    String getAddress();

    String getAddress2();

    String getPhone();
}
