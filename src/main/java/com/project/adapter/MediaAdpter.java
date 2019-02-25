package com.project.adapter;

import com.project.adapter.main.AdvancedMediaPlayer;
import com.project.adapter.main.Mp4Player;
import com.project.adapter.main.VlcPlayer;

/**
 * 创建适配器类
 *
 *@author: Weiyf
 *@Date: 2019-02-22 14:44
 */
public class MediaAdpter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdpter(String audioType){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        } else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        } else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
