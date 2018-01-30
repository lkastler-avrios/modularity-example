package com.avrios.example.domain;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

public class Driver {
    @NotNull
    private String name;

    private BigDecimal drivenMileage;

    public Driver(String name) {
        this.name = name;

        drivenMileage = new BigDecimal(Math.random() * 1000).setScale(2, BigDecimal.ROUND_DOWN);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getDrivenMileage() {
        return drivenMileage;
    }
}
