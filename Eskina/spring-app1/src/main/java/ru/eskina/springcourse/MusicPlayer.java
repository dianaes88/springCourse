package ru.eskina.springcourse;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

//@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> genres;

//    @Autowired
    public MusicPlayer(List<Music> genres) {
        this.genres = genres;
    }
//    @Autowired
//    @Qualifier("rockMusic")
//    public void setMusic1(Music music1) {
//        this.musicRock = music1;
//    }
//
//    @Autowired
//    @Qualifier("classicalMusic")
//    public void setMusic2(Music music2) {
//        this.musicClassic = music2;
//    }


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
    public String playMusic() {
        Music musicToPlay = genres.get(ThreadLocalRandom.current().nextInt(genres.size()));
        return "Playing " + musicToPlay.getSong();
    }
//    @Autowired
//    public void setMusic(Music music) {
//        this.music = music;
//    }
}
