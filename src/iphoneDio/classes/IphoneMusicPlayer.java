package iphoneDio.classes;

import iphoneDio.interfaces.MusicPlayer;

public class IphoneMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Tocando Taylor Swift");
    }

    @Override
    public void pause() {
        System.out.println("Musica Pausada");
    }
}
