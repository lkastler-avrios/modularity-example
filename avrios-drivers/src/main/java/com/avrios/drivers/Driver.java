package com.avrios.drivers;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Driver {
    private String name;

    private BigDecimal drivenMileage;

    public Driver(String name) {
        this.name = name;

        drivenMileage = new BigDecimal(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDrivenMileage() {
        return drivenMileage;
    }
}
