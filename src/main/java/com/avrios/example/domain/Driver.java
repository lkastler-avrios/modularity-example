package com.avrios.example.domain;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
public class Driver {
    @NotNull
    private String name;

    private BigDecimal drivenMileage;

    public Driver(String name) {
        this.name = name;

        drivenMileage = new BigDecimal(Math.random() * 1000).setScale(2, RoundingMode.HALF_UP);
    }
}
