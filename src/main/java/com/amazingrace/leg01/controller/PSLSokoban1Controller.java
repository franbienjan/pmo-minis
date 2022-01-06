package com.amazingrace.leg01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/psl-19")
public class PSLSokoban1Controller {

    private static final String PSL_SLIDE_1_HOME = "psl-19";

    @GetMapping()
    public String startLevel() {
        return PSL_SLIDE_1_HOME;
    }

}