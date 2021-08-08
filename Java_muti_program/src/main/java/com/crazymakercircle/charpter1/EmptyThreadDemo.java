package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;

public class EmptyThreadDemo {

    public static void main(String[] args) {
        Thread thread = new Thread();
        Print.cfo("线程名称：" + thread.getName());
        Print.cfo("线程Id：" + thread.getId());
        Print.cfo("线程状态：" + thread.getState());
        Print.cfo("线程优先级：" + thread.getPriority());
        Print.cfo("运行结束");

        thread.start();
    }
}
