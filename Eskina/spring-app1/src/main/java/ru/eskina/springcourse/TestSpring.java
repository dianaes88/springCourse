package ru.eskina.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
        Computer computer= context.getBean("computer", Computer.class);
//        System.out.println(computer.getMusicPlayer().playMusic(MusicTypeEnum.generateRandomMusicType()));
        System.out.println(computer.getMusicPlayer().playMusic());
//        System.out.println(computer.getMusicPlayer().playMusic(MusicTypeEnum.generateRandomMusicType()));
        ClassicalMusic classic1 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classic1.getSong());
        ClassicalMusic classic2 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classic1 == classic2);
//        RockMusic musicRock1 = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(musicRock1.getSong());
//        RockMusic musicRock2 = context.getBean("rockMusic", RockMusic.class);
//        System.out.println(musicRock2.getSong());

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        //test reference is the same(singleton bean scope)
//        System.out.println(firstMusicPlayer==secondMusicPlayer);
//        firstMusicPlayer.playMusic();
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
