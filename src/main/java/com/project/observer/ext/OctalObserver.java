package com.project.observer.ext;

import com.project.observer.Observer;
import com.project.observer.Subject;

/**
 * 创建观察者实体类
 *
 *@author: Weiyf
 *@Date: 2019-02-25 09:27
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
