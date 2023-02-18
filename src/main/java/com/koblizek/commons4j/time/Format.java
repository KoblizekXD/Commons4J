package com.koblizek.commons4j.time;

public class Format {
    private final int length;
    private final char type;
    private final String together;

    protected Format(int length, char type) {
        this.length = length;
        this.type = type;

        this.together = String.valueOf(type).repeat(length);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public int getLength() {
        return length;
    }

    public char getType() {
        return type;
    }

    public String getTogether() {
        return together;
    }
}
