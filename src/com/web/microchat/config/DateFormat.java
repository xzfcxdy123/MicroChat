package com.web.microchat.config;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

    public static String getDateFormat(Date date, String pattern) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);

    }
}
