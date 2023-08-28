package com.example.objectequals;

import lombok.Builder;
import lombok.Getter;

import java.util.Map;

/**
 * TestObject
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2023. 08. 28.
 */
@Getter
public class TestObject {

    private String title;
    private String part;
    private String name;
    private YoutubeObject youtubeObject;

    private Map<String, Object> extras;

    @Builder
    public TestObject(String title, String part, String name, YoutubeObject youtubeObject, Map<String, Object> extras) {
        this.title = title;
        this.part = part;
        this.name = name;
        this.youtubeObject = youtubeObject;
        this.extras = extras;
    }
}
