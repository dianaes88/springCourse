package ru.eskina.springcourse;

import java.util.concurrent.ThreadLocalRandom;

public enum MusicTypeEnum {
    CLASSICAL,
    ROCK;

    public static MusicTypeEnum generateRandomMusicType() {
        return values()[ThreadLocalRandom.current().nextInt(values().length)];
    }
}
