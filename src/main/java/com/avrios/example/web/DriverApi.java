package com.avrios.example.web;

import com.avrios.example.domain.Driver;
import com.avrios.example.service.DriverService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.Optional;
import java.util.stream.Stream;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/drivers")
public class DriverApi {

    @Inject
    private DriverService driverService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    public Stream<Driver> getDrivers() {
        return driverService.findAll();
    }
}
