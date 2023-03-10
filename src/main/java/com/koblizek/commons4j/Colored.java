package com.koblizek.commons4j;

import java.awt.*;

public final class Colored {
    private final Color color;

    public Colored(Color color) {
        this.color = color;
    }
    public Colored(int r, int g, int b) {
        this.color = new Color(r, g, b);
    }
    public Colored(int r, int g, int b, int a) {
        this.color = new Color(r, g, b, a);
    }
    public Color toColor() {
        return this.color;
    }
    public String toHex() {
        String temp = Integer.toHexString(color.getRGB());
        return "#" + temp.substring(temp.length() - 6);
    }
    public String toEscapeSequence(boolean isBackground) {
        return "\033["
                + (isBackground ? "48" : "38")
                + ";2;"
                + color.getRed() + ";"
                + color.getGreen() + ";"
                + color.getBlue() + "m";
    }
    public static final String RESET = "\033[39m\033[49m";
    public static String getEscapedString(Color color, String text) {
        return new Colored(color).toEscapeSequence(false) + text + RESET;
    }
}
