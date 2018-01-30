package com.avrios.example.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.security.SecureRandom;

@Getter
public class Driver {
    @NotNull
    private String name;

    private BigDecimal drivenMileage;

    public Driver(String name) {
        this.name = name;

        drivenMileage = new BigDecimal(Math.random() * 1000).setScale(2, BigDecimal.ROUND_DOWN);
    }
}
