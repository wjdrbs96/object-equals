package com.example.objectequals;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Map;

import static com.example.objectequals.MapperUtil.DEFAULT_OBJECT_MAPPER;

/**
 * Example1
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2023. 08. 28.
 */
public class Example1 {
    public static void main(String[] args) throws JsonProcessingException {
        TestObject testObject1 = TestObject.builder()
                .title("제목")
                .part("파트")
                .name("이름")
                .extras(Map.of("key1", GoogleObject.builder().name("구글").content("내용").color("검은색").build()))
                .build();

        TestObject testObject2 = TestObject.builder()
                .title("제목")
                .part("파트")
                .name("이름")
                .extras(Map.of("key1", GoogleObject1.builder().name("구글").content("내용").color("검은색").build()))
                .build();

        String test1 = DEFAULT_OBJECT_MAPPER.writeValueAsString(testObject1);
        String test2 = DEFAULT_OBJECT_MAPPER.writeValueAsString(testObject2);

        System.out.println("Result: " + test1.equals(test2));
    }
}
