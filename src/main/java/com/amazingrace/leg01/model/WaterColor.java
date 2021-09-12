package com.amazingrace.leg01.model;

public enum WaterColor {

    RED(0, "Red", "/pul91ai.png"),
    SKY_BLUE(1, "Sky Blue", "/sky18u.png"),
    BROWN(2, "Brown", "/wy27se.png"),
    YELLOW(3, "Yellow", "/dila1k.png"),
    PINK(4, "Pink", "/rosa23s.png"),
    ORANGE(5, "Orange", "/13quen.png"),
    GREEN(6, "Green", "/qp2ie8.png"),
    DARK_BLUE(7, "Dark Blue", "/maos32.png"),
    PURPLE(8, "Purple", "/l00lila.png"),
    SILVER(9, "Silver", "/agn01w.png"),
    SLUDGE(10, "Sludge", "/watersludge.png");

    private int id;
    private String color;
    private String url;

    WaterColor(int id, String color, String url) {
        this.id = id;
        this.color = color;
        this.url = url;
    }

    public String getString() {
        return color;
    }

    public String getUrl() {
        return url;
    }

    public int getId() {
        return id;
    }

    public static WaterColor getById(int id) {
        return WaterColor.values()[id];
    }
}
