package ru.eskina.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component

public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    private ClassicalMusic() {
        songs.add("Badinerie");
        songs.add("Ave Maria");
        songs.add("Carnival of the animals");
    }
    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Create classical music bean");
        return new ClassicalMusic();
    }
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return getRandomSong();
    }

    private String getRandomSong() {
        return songs.get(ThreadLocalRandom.current().nextInt(songs.size()));
    }
}
