package cn.imustacm.common.utils;


import cn.imustacm.common.consts.DatePatternConst;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Local Date Time Serializable
 *
 * @author heihaier@mmears.com
 * Date: 2018/8/28
 * Time: 下午5:47
 */
public class LocalDateTimeJsonSerializable extends JsonSerializer<LocalDateTime> {

    @Override
    public void serialize(LocalDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {

        gen.writeString(DatePatternConst.DATE_TIME_FORMATTER.format(value));
    }
}
