package com.project.template;

/**
 * 模板模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:21
 */
public class TemplateDemo {

    public static void main(String[] args){

        //执行具体扩展类的业务方法
        Game game = new Circket();
        game.play();

        game = new Football();
        game.play();

    }

}
