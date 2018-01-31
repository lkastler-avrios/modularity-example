package com.avrios.web;

import com.avrios.drivers.Driver;
import com.avrios.drivers.DriverService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.stream.Stream;

@RestController
@RequestMapping("/drivers")
public class DriverApi {

    @Inject
    private DriverService driverService;

    @RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Stream<Driver> getDrivers() {
        return driverService.findAll();
    }
}
