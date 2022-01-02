package com.amazingrace.leg01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/boracaypuzz")
public class BoracayPuzzController {

    private static final String BORACAY_PUZZ_HOME = "boracaypuzz";

    @GetMapping()
    public String startLevel() {
        return BORACAY_PUZZ_HOME;
    }

}
