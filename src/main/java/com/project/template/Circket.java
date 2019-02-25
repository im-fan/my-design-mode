package com.project.template;

/**
 * 扩展类实现具体方法
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:19
 */
public class Circket extends Game {
    @Override
    void initialize() {
        System.out.println("Circket init");
    }

    @Override
    void startPlay() {
        System.out.println("Circket start");
    }

    @Override
    void endPlay() {
        System.out.println("Circket end");
    }
}
