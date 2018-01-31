package com.avrios.drivers;

import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.stream.Stream;

@Service
public class DriverService {

    @Inject
    private DriverRepository driverRepository;

    public Stream<Driver> findAll() {
        return driverRepository.findAll();
    }
}
