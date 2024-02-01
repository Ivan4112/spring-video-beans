package com.epam.rd.autotasks.confbeans.impl;

import com.epam.rd.autotasks.confbeans.video.Video;
import com.epam.rd.autotasks.confbeans.video.VideoStudio;

import java.time.LocalDateTime;

public class VideoStudioBuildHouseImpl implements VideoStudio {
    @Override
    public Video produce() {
        LocalDateTime localDateTime = LocalDateTime.of(2020, 10, 10, 10, 11);
        String name = "How to build a house";
        return new Video(name, localDateTime);
    }
}
