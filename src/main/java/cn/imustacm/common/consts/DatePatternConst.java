package cn.imustacm.common.consts;

import java.time.format.DateTimeFormatter;

public final class DatePatternConst {

    private DatePatternConst() {

    }

    public static final String DATE_PATTERN = "yyyy-MM-dd";

    public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_PATTERN);



}
