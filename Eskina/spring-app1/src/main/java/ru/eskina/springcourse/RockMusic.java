package ru.eskina.springcourse;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music {
    private RockMusic() {
    }

    public static RockMusic getRockMusic() {
        System.out.println("Create rock music bean");
        return new RockMusic();
    }

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }

    private void doMyInit() {
        System.out.println("Doing my initialization for rock");
    }

    private void doMyDestroy() {
        System.out.println("Doing my destruction for rock");
    }
}
