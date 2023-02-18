package com.koblizek.commons4j.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
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
        return new Format(length, 'y');
    }

    public DateFormatter(String splitter, Format ... formatting) {
        this.splitter = splitter;
        this.formatting = formatting;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Format format : formatting) {
            builder.append(splitter)
                    .append(format.toString());
        }
        return builder.substring(1);
    }
    public String toDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern(toString()));
    }
}
