package com.project.proxy;

/**
 * 代理类
 *
 *@author: Weiyf
 *@Date: 2019-02-18 13:51
 */
public class ProxyImage implements Image {

    private String fileName;
    private ReadImage readImage;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(readImage == null){
            readImage = new ReadImage(fileName);
        }
        readImage.display();
    }
}
