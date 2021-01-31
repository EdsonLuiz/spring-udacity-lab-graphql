package com.edson.doggraphql.repository;

import com.edson.doggraphql.entity.Dog;

import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
    
}
