package com.amazingrace.leg01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hallyufinale")
public class HallyuFinaleController {

    private static final String HALLYU_FINALE = "hallyu-finale";

    @GetMapping()
    public String startLevel() {
        return HALLYU_FINALE;
    }

}
