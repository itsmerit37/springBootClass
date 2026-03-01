package com.ritesh.myFirstSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private BMW bmw;

    public String getCarModel() {
        return bmw.getModel();
    }

}
