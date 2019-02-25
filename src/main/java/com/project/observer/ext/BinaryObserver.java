package com.project.observer.ext;

import com.project.observer.Observer;
import com.project.observer.Subject;

/**
 * 创建实体观察者类。
 *
 *@author: Weiyf
 *@Date: 2019-02-25 09:26
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
