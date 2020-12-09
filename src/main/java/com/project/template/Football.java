package com.project.template;

/**
 * 扩展类实现具体方法
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:19
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football init");
    }

    @Override
    void startPlay() {
        System.out.println("Football start");
    }

    @Override
    void endPlay() {
        System.out.println("Football end");
    }

    /** 模板类不加final，扩展类就可以自己重新定义模板类方法 **/
    /*@Override
    public void play(){
        System.out.println("====>异常");
        startPlay();

        endPlay();
    }*/
}
