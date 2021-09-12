package com.amazingrace.leg01.service;

import com.amazingrace.leg01.model.WaterColor;
import org.springframework.stereotype.Service;

import static com.amazingrace.leg01.model.WaterColor.*;

@Service
public class BathhouseWaterService {

    // Level Colors
    public static final int[] LEVEL_COLORS = {3, 6, 9};

    // Limit
    private final int[] ATTEMPTS = {4, 5, 9};

    // FUNCTION: Retrieve winning color
    public WaterColor getEndColor(int level, int modifier) {
        return WaterColor.getById(Math.floorMod(modifier + LEVEL_COLORS[level-1], 10));
    }

    // FUNCTION: Returns color depending on input.
    public WaterColor getOutputColor(int level, WaterColor color, int tile, int attempts, int modifier) {

        level--;
        // Increment attempt count
        if (attempts >= ATTEMPTS[level]) {
            return SLUDGE;
        }

        tile--;
        int colorId = Math.floorMod(color.getId() - modifier - LEVEL_COLORS[level], 10);

        int resultId = -1;
        if (level == 0) {
            int table[][] = {
                    {1, 2, 0}, //0
                    {0, 2, 1}, //1
                    {0, 1, 3}  //2
            };
            resultId = table[colorId][tile];
        } else if (level == 1) {
            int table[][] = {
                    {0, 1, 2, 2}, //0
                    {1, 1, 2, 1}, //1
                    {0, 1, 1, 3}, //2
                    {1, 2, 3, 4}, //3
                    {3, 5, 4, 2}, //4
                    {2, 4, 6, 0}  //5
            };
            resultId = table[colorId][tile];
        } else if (level == 2) {
            int table[][] = {
                    {1, 1, 0, 2, 0}, //0
                    {1, 2, 1, 2, 1}, //1
                    {0, 1, 1, 3, 2}, //2
                    {4, 2, 5, 2, 2}, //3
                    {1, 4, 2, 4, 5}, //4
                    {4, 2, 7, 6, 1}, //5
                    {5, 2, 6, 2, 0}, //6
                    {6, 8, 0, 1, 3}, //7
                    {2, 4, 6, 3, 9}  //8
            };
            resultId = table[colorId][tile];
        }

        resultId = Math.floorMod(resultId + modifier + LEVEL_COLORS[level], 10);
        return WaterColor.getById(resultId);
    }

}
