package ru.eskina.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

//    @Autowired
//    public MusicPlayer(@Qualifier("rockMusic")Music music1, @Qualifier("classicalMusic")Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }
    @Autowired
    @Qualifier("rockMusic")
    public void setMusic1(Music music1) {
        this.music1 = music1;
    }

    @Autowired
    @Qualifier("classicalMusic")
    public void setMusic2(Music music2) {
        this.music2 = music2;
    }


    //    private String name;
//    private int volume;
//    @Autowired
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
//
//    public MusicPlayer() {
//    }
    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
    public int getVolume() {
        return volume;
    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }


//    public MusicPlayer(List<Music> playList) {
//        this.playList = playList;
//    }
//
//    public void setPlayList(List<Music> playList) {
//        this.playList = playList;
//    }

//    public  void playMusic() {
//        playList.forEach(music-> System.out.println(music.getSong()));
//    }
    public String playMusic(MusicTypeEnum musicType) {
        Music musicToPlay;
        switch (musicType) {
            case ROCK:
                musicToPlay = music1;
                break;
            case CLASSICAL:
                musicToPlay = music2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + musicType);
        }
        return "Playing " + musicToPlay.getSong();
    }
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
}
