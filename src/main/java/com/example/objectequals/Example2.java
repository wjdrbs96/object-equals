package com.example.objectequals;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.example.objectequals.MapperUtil.DEFAULT_OBJECT_MAPPER;

/**
 * Example2
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2023. 08. 28.
 */
public class Example2 {
    public static void main(String[] args) throws JsonProcessingException {
        Map<String, Object> extras1 = new HashMap<>();
        extras1.put("key1", "value1");
        extras1.put("key2", 42);
        extras1.put("key3", Arrays.asList("a", "b", "c"));

        Map<String, Object> extras2 = new HashMap<>();
        extras2.put("key1", "value1");
        extras2.put("key2", 42);
        extras2.put("key3", Arrays.asList("a", "b", "c"));

        YoutubeObject youtubeObject1 = YoutubeObject.builder()
                .title("youtubeTitle1")
                .channelName("channelName1")
                .thumbnailImage("thumbnailImage1")
                .build();

        YoutubeObject youtubeObject2 = YoutubeObject.builder()
                .title("youtubeTitle")
                .channelName("channelName1")
                .thumbnailImage("thumbnailImage1")
                .build();

        TestObject obj1 = new TestObject("Title", "Part", "Name", youtubeObject1, extras1);
        TestObject obj2 = new TestObject("Title", "Part", "Name", youtubeObject2, extras2);

        String test1 = DEFAULT_OBJECT_MAPPER.writeValueAsString(obj1);
        String test2 = DEFAULT_OBJECT_MAPPER.writeValueAsString(obj2);

        System.out.println("Deep equals: " + test1.equals(test2));
    }
}
