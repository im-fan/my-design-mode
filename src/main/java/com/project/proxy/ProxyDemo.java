package com.project.proxy;


/**
 * 代理模式demo
 *
 *@author: Weiyf
 *@Date: 2019-02-18 13:53
 */
public class ProxyDemo {

    public static void main(String[] args){
        Image image = new ProxyImage("c://file.jpg");
        System.out.println("首次需要加载===>");
        image.display();
        System.out.println("不需要加载===>");
        image.display();
    }

}
