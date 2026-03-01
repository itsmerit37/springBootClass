package com.ritesh.myFirstSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BMW {
    @GetMapping("/bmw")
        public String getModel(){
            return "BMW 3 Series";
        }
}
