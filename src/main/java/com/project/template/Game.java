package com.project.template;

/**
 * 定义模板方法、不允许修改
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:17
 */
public abstract class Game {

    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /** 定义模板 **/
    public final void play(){
        initialize();

        startPlay();

        endPlay();
    }

}
