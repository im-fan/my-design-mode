package com.project.adapter;

/**
 * 具体业务，使用适配器
 *
 *@author: Weiyf
 *@Date: 2019-02-22 14:53
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdpter adpter;

    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("播放MP3文件："+fileName);
        }else if(audioType.equalsIgnoreCase("vlc")
            || audioType.equalsIgnoreCase("mp4")){
            adpter = new MediaAdpter(audioType);
            adpter.play(audioType,fileName);
        } else {
            System.out.println(audioType + "文件格式不支持");
        }
    }
}
