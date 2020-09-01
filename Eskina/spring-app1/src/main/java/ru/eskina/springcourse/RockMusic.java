package ru.eskina.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//@Component
public class RockMusic implements Music {
    private List<String> songs = new ArrayList<>();
    public RockMusic() {
        songs.add("We will rock you");
        songs.add("Smoke on the water");
        songs.add("Hotel California");

    }

    public static RockMusic getRockMusic() {
        System.out.println("Create rock music bean");
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return getRandomSong();
    }

    private String getRandomSong() {
        return songs.get(ThreadLocalRandom.current().nextInt(songs.size()));
    }

    private void doMyInit() {
        System.out.println("Doing my initialization for rock");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction for rock");
    }
}
