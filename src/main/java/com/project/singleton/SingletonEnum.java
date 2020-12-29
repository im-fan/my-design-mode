package com.project.singleton;
/**
 * 单例-枚举实现
 * @Date 2020/12/29 16:03
 * @Author weiyf
**/
public class SingletonEnum {

    public enum SingleEnum{
        Instance;

        public void doSomething(){
            System.out.println(" 打印啊啊啊啊 ");
        }
    }

    public static void main(String[] args) {
        SingleEnum.Instance.doSomething();
    }

}
