package com.avrios.example.repository;

import com.avrios.example.domain.Driver;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.stream.Stream;

@Repository
public class DriverRepository {

    private Map<String, Driver> drivers;

    @PostConstruct
    private void init() {
        drivers = Maps.newHashMap(Maps.asMap(Sets.newHashSet("Ciarán","Olga"), Driver::new));
    }

    public Stream<Driver> findAll() {
        return drivers.values().stream();
    }
}
