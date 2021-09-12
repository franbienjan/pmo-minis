package com.amazingrace.leg01.model;

import java.util.List;

public class WaterDto {

    private int id;
    private WaterColor color;
    private WaterColor endColor;
    private int attempts;
    private int level;
    private int modifier;
    private List<String> colorHistory;

    public WaterColor getColor() {
        return color;
    }

    public void setColor(WaterColor color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public List<String> getColorHistory() {
        return colorHistory;
    }

    public void setColorHistory(List<String> colorHistory) {
        this.colorHistory = colorHistory;
    }

    public boolean isSuccess() {
        return endColor == color;
    }

    public int getModifier() {
        return modifier;
    }

    public void setModifier(int modifier) {
        this.modifier = modifier;
    }

    public WaterColor getEndColor() {
        return endColor;
    }

    public void setEndColor(WaterColor endColor) {
        this.endColor = endColor;
    }
}
