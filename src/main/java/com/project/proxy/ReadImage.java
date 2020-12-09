package com.project.proxy;

/**
 * 接口实现类
 *
 *@author: Weiyf
 *@Date: 2019-02-22 11:05
 */
public class ReadImage implements Image {
    private String fileName;

    public ReadImage(String fileName){
        this.fileName = fileName;
        loadFile(fileName);
    }

    @Override
    public void display() {
        System.out.println("显示图片===>" + fileName);
    }

    private void loadFile(String fileName){
        System.out.println("加载文件====>" + fileName);
    }
}
