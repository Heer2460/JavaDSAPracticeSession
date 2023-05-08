package com.binary.tree;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    private static final ZoneId GMT_ZONE = ZoneId.of("GMT");

    public ZonedDateTime convertToZonedDateTime(LocalDateTime localDateTime) {
        return ZonedDateTime.of(localDateTime,GMT_ZONE);
    }
    void print(float value) {
        System.out.println(String.format(String.valueOf(value)));
    }

    public static void main(String[] args) {

    }
}
