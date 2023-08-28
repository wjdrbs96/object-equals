package com.example.objectequals;

import lombok.Builder;
import lombok.Getter;

/**
 * GoogleObject
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2023. 08. 28.
 */
@Getter
public class GoogleObject {

    private String name;
    private String content;

    private String color;

    @Builder
    public GoogleObject(String name, String content, String color) {
        this.name = name;
        this.content = content;
        this.color = color;
    }
}
