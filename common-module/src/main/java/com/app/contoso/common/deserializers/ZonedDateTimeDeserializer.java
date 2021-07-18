package com.app.contoso.common.deserializers;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author t0k02w6 on 18/07/21
 * @project contoso-retail
 */
public class ZonedDateTimeDeserializer extends JsonDeserializer<ZonedDateTime> {
    @Override
    public ZonedDateTime deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        String dateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSSxxx";
        return ZonedDateTime.parse(jsonParser.getText(), DateTimeFormatter.ofPattern(dateFormat));
    }
}
