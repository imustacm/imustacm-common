package cn.imustacm.common.utils;


import cn.imustacm.common.consts.DatePatternConst;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;


public class LocalDateTimeJsonSerializable extends JsonSerializer<LocalDateTime> {

    @Override
    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

        gen.writeString(DatePatternConst.DATE_TIME_FORMATTER.format(value));
    }
}
