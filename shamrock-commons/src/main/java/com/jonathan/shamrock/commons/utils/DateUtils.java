package com.jonathan.shamrock.commons.utils;


import lombok.experimental.UtilityClass;

import java.time.LocalDate;

@UtilityClass
public class DateUtils {

    public static LocalDate today() {
        return LocalDate.now();
    }
}
