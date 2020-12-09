package com.project.observer.ext;

import com.project.observer.Observer;
import com.project.observer.Subject;

/**
 * 创建观察者实体类
 *
 *@author: Weiyf
 *@Date: 2019-02-25 09:28
 */
public class HexaObserver extends Observer {
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
