package com.amazingrace.leg01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hazardfinale")
public class RushSlideController {

    private static final String RUSH_SLIDE_HOME = "rush-slide";

    @GetMapping()
    public String startLevel() {
        return RUSH_SLIDE_HOME;
    }

}
