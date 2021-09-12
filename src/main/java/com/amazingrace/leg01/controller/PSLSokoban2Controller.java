package com.amazingrace.leg01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/psl-aklan-dos")
public class PSLSokoban2Controller {

    private static final String PSL_SLIDE_2_HOME = "psl-aklan-2";

    @GetMapping()
    public String startLevel() {
        return PSL_SLIDE_2_HOME;
    }

}