package com.amazingrace.leg01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/psl-19-thr33")
public class PSLSokoban3Controller {

    private static final String PSL_SLIDE_3_HOME = "psl-aklan-3";

    @GetMapping()
    public String startLevel() {
        return PSL_SLIDE_3_HOME;
    }

}