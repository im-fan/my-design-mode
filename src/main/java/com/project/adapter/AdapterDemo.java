package com.project.adapter;

/**
 * 适配器模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-22 14:56
 */
public class AdapterDemo {

    public static void main(String[] args){
         AudioPlayer audioPlayer = new AudioPlayer();

         audioPlayer.play("mp3","hello.mp3");
         audioPlayer.play("mp4","ahahhha.mp4");
         audioPlayer.play("vlc","光头强.vlc");
         audioPlayer.play("avi","佩奇.avi");
    }
}
