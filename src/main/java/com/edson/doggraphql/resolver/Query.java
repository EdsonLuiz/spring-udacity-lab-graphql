package com.edson.doggraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.edson.doggraphql.entity.Dog;
import com.edson.doggraphql.repository.DogRepository;

import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    private DogRepository dogRepository;

    public Query(DogRepository dogRepository) {
        this.dogRepository = dogRepository;
    }

    public Iterable<Dog> findAllDogs() {
        return dogRepository.findAll();
    }
}
