package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;

import java.util.concurrent.*;

import static com.crazymakercircle.util.ThreadUtil.sleepMilliSeconds;
/**
 * @author Zhang
 * @date 8/10/2021 10:29 AM
 * @description
 */
public class CreateDemo4 {
    public static final int MAX_TURN = 5;
    public static final int COMPUTE_TIMES = 10000000;

    public static String getCurThreadName() {
        return Thread.currentThread().getName();
    }
    //创建一个包含三个线程的线程池
    private static ExecutorService pool = Executors.newFixedThreadPool(3);

    static class DemoThread implements Runnable {
        @Override
        public void run() {
            for (int j = 0; j < MAX_TURN; j++) {
                Print.cfo(getCurThreadName() + ",轮次： " + j);
                sleepMilliSeconds(10);
            }
        }
    }

    static class ReturnableTask implements Callable<Long> {
        @Override
        public Long call() throws Exception {
            long startTime = System.currentTimeMillis();
            Print.cfo(getCurThreadName()+"线程运行开始。");
            for (int j = 0; j < MAX_TURN; j++) {
                Print.cfo(getCurThreadName() + ",轮次：" + j);
                sleepMilliSeconds(10);
            }
            long used = System.currentTimeMillis() - startTime;
            return used;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        pool.execute(new DemoThread()); //方式一：执行线程实例，无返回
        //方式一：执行Runnable执行目标实例，无返回
        pool.execute(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < MAX_TURN; j++) {
                    Print.cfo(getCurThreadName()+"运行结束");
                }
            }
        });

        //提交Callable执行目标实例，有返回
        Future future = pool.submit(new ReturnableTask());
        Long result = (Long) future.get();
        Print.cfo("异步任务的执行结果：" + result);
        sleepMilliSeconds(Integer.MAX_VALUE);

    }
}
