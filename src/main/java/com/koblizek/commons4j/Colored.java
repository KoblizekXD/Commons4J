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
}
