package com.example.objectequals;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * YoutubeObject
 *
 * @author JungGyun.Choi
 * @version 1.0.0
 * @since 2023. 08. 28.
 */
@NoArgsConstructor
@Getter
public class YoutubeObject {

    private String channelName;
    private String thumbnailImage;
    private String title;

    @Builder
    public YoutubeObject(String channelName, String thumbnailImage, String title) {
        this.channelName = channelName;
        this.thumbnailImage = thumbnailImage;
        this.title = title;
    }
}
