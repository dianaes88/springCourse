package ru.eskina.springcourse;

public class RockMusic implements Music {
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
