package ru.eskina.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ClassicalMusic classic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classic1.getSong());
//        ClassicalMusic classic2 = context.getBean("musicBeanClassic", ClassicalMusic.class);
//        System.out.println(classic2.getSong());
        RockMusic musicRock1 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(musicRock1.getSong());
        RockMusic musicRock2 = context.getBean("rockMusic", RockMusic.class);
        System.out.println(musicRock2.getSong());

//        TestBean testBean = context.getBean("testBean", TestBean.class);
//        System.out.println(testBean.getName());
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        //test reference is the same(singleton bean scope)
//        System.out.println(firstMusicPlayer==secondMusicPlayer);
//        firstMusicPlayer.playMusic();
//        System.out.println(firstMusicPlayer.getName());
//        System.out.println(firstMusicPlayer.getVolume());
//        firstMusicPlayer.setVolume(10);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
        context.close();
    }
}
