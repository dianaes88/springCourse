package ru.eskina.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class MusicPlayer {
//    private List<Music> playList = new ArrayList<>();
    private Music music;
//    private String name;
//    private int volume;
//    @Autowired
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer() {
    }
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
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
    public  void playMusic() {
        System.out.println("Playing " + music.getSong());
    }
    @Autowired
    public void setMusic(Music music) {
        this.music = music;
    }
}
