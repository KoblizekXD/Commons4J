package com.koblizek.commons4j.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeFormatter {
    private final String splitter;
    private final Format[] formatting;

    public static Format sec(int length) {
        return new Format(length, 's');
    }
    public static Format hour(int length) {
        return new Format(length, 'H');
    }
    public static Format min(int length) {
        return new Format(length, 'm');
    }

    public TimeFormatter(String splitter, Format ... formatting) {
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
    public String toTime(LocalTime time) {
        return time.format(DateTimeFormatter.ofPattern(toString()));
    }
    public String toTimeAM(LocalTime time) {
        return time.format(DateTimeFormatter.ofPattern(this + " a"));
    }
    public static String predefined() {
        return new TimeFormatter(":", hour(2), min(2), sec(2)).toTime(LocalTime.now());
    }
    public static String predefinedAM() {
        return new TimeFormatter(":", hour(2), min(2), sec(2)).toTimeAM(LocalTime.now());
    }
}
