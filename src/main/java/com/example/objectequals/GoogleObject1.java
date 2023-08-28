package com.example.objectequals;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;

/**
 * GoogleObject1
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2023. 08. 28.
 */
@Getter
public class GoogleObject1 {

    private String name;
    private String content;
    @JsonIgnore
    private String color;

    @Builder
    public GoogleObject1(String name, String content, String color) {
        this.name = name;
        this.content = content;
        this.color = color;
    }
}
