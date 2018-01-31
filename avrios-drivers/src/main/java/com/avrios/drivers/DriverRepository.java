package com.avrios.drivers;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Map;
import java.util.stream.Stream;

import static com.google.common.collect.Sets.newHashSet;

@Repository
public class DriverRepository {

    private Map<String, Driver> drivers;

    @PostConstruct
    private void init() {
        drivers = Maps.newHashMap(Maps.asMap(newHashSet("Ciarán","Olga"), Driver::new));
    }

    public Stream<Driver> findAll() {
        return drivers.values().stream();
    }
}
