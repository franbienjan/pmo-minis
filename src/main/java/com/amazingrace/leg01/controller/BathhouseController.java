package com.amazingrace.leg01.controller;

import com.amazingrace.leg01.service.BathhouseWaterService;
import com.amazingrace.leg01.model.WaterColor;
import com.amazingrace.leg01.model.WaterDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/leg01/bathhouse")
public class BathhouseController {

    @Autowired
    private BathhouseWaterService bathhouseWaterService;

    private static final String BATHHOUSE_HOME = "bathhouse";
    private static final String BATHHOUSE_TASK = "bathhouse-task";

    @GetMapping()
    public String bathhouseHome() {
        return BATHHOUSE_HOME;
    }

    @GetMapping("/start")
    public String startLevel(@RequestParam("level") int level,
                             @RequestParam("modifier") int modifier,
                             Model model) {

        modifier = modifier % 10;
        if (modifier < 0) {
            modifier = 0;
        }
        int adj = BathhouseWaterService.LEVEL_COLORS[level-1];
        WaterDto waterDto = new WaterDto();
        waterDto.setColor(WaterColor.getById(Math.floorMod(adj + modifier, 10)));
        waterDto.setAttempts(0);
        waterDto.setLevel(level);
        waterDto.setEndColor(bathhouseWaterService.getEndColor(level, modifier + adj));
        waterDto.setModifier(modifier);

        List<String> colorHistory = new ArrayList<>();
        colorHistory.add(waterDto.getColor().getString());
        waterDto.setColorHistory(colorHistory);

        model.addAttribute("water", waterDto);

        return BATHHOUSE_TASK;
    }

    @PostMapping("/solve")
    public String getNextColor(@ModelAttribute("water") @Valid WaterDto waterDto,
                               @RequestParam("tile") int selectedTile,
                               Model model) {

        int level = waterDto.getLevel();
        int modifier = waterDto.getModifier();
        WaterColor prevColor = waterDto.getColor();
        int attempts = waterDto.getAttempts();

        WaterColor currColor = bathhouseWaterService.getOutputColor(level, prevColor, selectedTile, attempts, modifier);
        waterDto.setColor(currColor);
        waterDto.setAttempts(waterDto.getAttempts() + 1);

        List<String> colorHistory = waterDto.getColorHistory();
        colorHistory.add(currColor.getString());
        waterDto.setColorHistory(colorHistory);

        model.addAttribute("water", waterDto);

        // TODO: Randomize tiles. (this is cruel)
        // TODO: Modifier limit! (<10)

        return BATHHOUSE_TASK;
    }
}
