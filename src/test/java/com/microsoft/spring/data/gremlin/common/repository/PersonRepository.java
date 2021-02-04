/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for
 * license information.
 */
package com.microsoft.spring.data.gremlin.common.repository;

import org.springframework.data.repository.query.Param;
import com.microsoft.spring.data.gremlin.common.domain.Person;
import com.microsoft.spring.data.gremlin.repository.GremlinRepository;
import org.springframework.stereotype.Repository;
import com.microsoft.spring.data.gremlin.annotation.Query;

@Repository
public interface PersonRepository extends GremlinRepository<Person, String> {
    @Query("g.V().has('name', name)")
    public Person findPersonByName(@Param("name") String name);
}
