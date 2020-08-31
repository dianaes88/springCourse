package ru.eskina.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("Create classical music bean");
        return new ClassicalMusic();
    }
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
