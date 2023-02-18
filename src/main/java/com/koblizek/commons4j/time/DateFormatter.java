package com.koblizek.commons4j.time;

import java.util.Arrays;

public class DateFormatter {

    private final String splitter;
    private final Format[] formatting;

    public static Format day(int length) {
        return new Format(length, 'd');
    }
    public static Format month(int length) {
        return new Format(length, 'M');
    }
    public static Format year(int length) {
        return new Format(length, 'd');
    }

    public DateFormatter(String splitter, Format ... formatting) {
        this.splitter = splitter;
        this.formatting = formatting;
    }

    @Override
    public String toString() {
        return Arrays.stream(formatting)
                .map(format -> splitter + format.toString())
                .toString().substring(1);
    }
}
