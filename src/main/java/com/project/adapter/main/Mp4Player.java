package com.project.adapter.main;

/**
 * 实现需要的业务
 *
 *@author: Weiyf
 *@Date: 2019-02-22 14:37
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("播放Mp4文件："+fileName);
    }
}
