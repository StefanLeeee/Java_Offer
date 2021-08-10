package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author Zhang
 * @date 8/9/2021 5:04 PM
 * @description
 */
public class CreateDemo3 {
    public static final int MAX_TURN = 5;
    public static final int COMPUTE_TIMES = 1000000;
    public static String getCurThreadName() {
        return Thread.currentThread().getName();
    }
    //1、创建一个Callable接口的实现类
    static class ReturnableTask implements Callable<Long> {
        //2、编写好异步执行的具体逻辑，并且可以有返回值
        @Override
        public Long call() throws Exception {
            long startTime = System.currentTimeMillis();
            Print.cfo(getCurThreadName()+"线程运行开始");
            Thread.sleep(1000);
            for (int i = 0; i < COMPUTE_TIMES; i++) {
                int j = i * 10000;
            }
            long used = System.currentTimeMillis() - startTime;
            Print.cfo(getCurThreadName()+"线程运行结束");
            return used;
        }
    }
    public static void main(String args[]) throws InterruptedException {
        ReturnableTask task=new ReturnableTask();// ③
        FutureTask<Long> futureTask = new FutureTask<Long>(task);// ④
        Thread thread = new Thread(futureTask, "returnableThread");// ⑤
        thread.start();// ⑥

        Thread.sleep(500);
        Print.cfo(getCurThreadName() + " 让子弹飞一会儿");
        Print.cfo(getCurThreadName() + " 做一点自己的事情");
        for (int i = 0; i < COMPUTE_TIMES / 2; i++) {
            int j = i * 10000;
            Print.cfo(getCurThreadName() + " 获取并发任务的执行结果");
            try {
                Print.cfo(thread.getName() + " 线程占用时间："
                        + futureTask.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }


        }
        Print.cfo(getCurThreadName() + " 运行结束");
    }

}
