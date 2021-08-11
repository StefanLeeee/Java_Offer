package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;

import java.util.concurrent.atomic.AtomicInteger;

import static com.crazymakercircle.util.ThreadUtil.sleepMilliSeconds;

/**
 * @author RenbingZhang
 * @Description
 * 使用Executors.newSingleThreadExecutor()快捷工厂去创建一个“单线程化线程池”
 *
 * @create 2021-08-11 11:24 PM
 */
public class CreateThreadPoolDemo {
    public static final int SLEEP_GAP = 500;

    //异步任务的执行目标类
    static class TargetTask implements Runnable {
        static AtomicInteger taskNo = new AtomicInteger(1);
        private String taskName;
        public TargetTask() {
            taskName = "task-" + taskNo.get();
            taskNo.incrementAndGet();
        }
        @Override
        public void run() {
            Print.tco("任务：" + taskName + "doing");
            //线程睡眠一会
            sleepMilliSeconds(SLEEP_GAP);
            Print.tco(taskName+"运行结束");
        }
    }
}
