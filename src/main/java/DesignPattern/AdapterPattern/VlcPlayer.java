package DesignPattern.AdapterPattern;

/**
 * Created by john on 2017/10/1.
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playMp4(String fileName) {

    }

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }
}
