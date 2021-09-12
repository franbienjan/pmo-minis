package com.amazingrace.leg01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/barrelslide")
public class BarrelSlideController {

    private static final String BARREL_SLIDE_HOME = "barrelslide";

    @GetMapping()
    public String startLevel() {
        return BARREL_SLIDE_HOME;
    }

}
