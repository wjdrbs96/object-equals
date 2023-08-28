package com.example.objectequals;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;

/**
 * MapperUtil
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2023. 08. 28.
 */
public class MapperUtil {

    public static final ObjectMapper DEFAULT_OBJECT_MAPPER = new ObjectMapper()
            .registerModules(new ParameterNamesModule(), new Jdk8Module(), new JavaTimeModule())
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
            .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, true)
            .configure(SerializationFeature.WRITE_DATES_WITH_ZONE_ID, true)
            .configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
}
