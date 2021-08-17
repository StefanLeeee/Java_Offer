package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;
import com.crazymakercircle.util.RandomUtil;
import org.junit.Test;
import sun.font.FontRunIterator;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static com.crazymakercircle.util.ThreadUtil.sleepMilliSeconds;
import static com.crazymakercircle.util.ThreadUtil.sleepSeconds;

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

    //测试用例：只有一个线程的线程池
    @Test
    public void testSingleThreadExecutor() {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            pool.execute(new TargetTask());
            pool.submit(new TargetTask());
        }
        sleepSeconds(1000);
        pool.shutdown();
    }

    //测试用例：只有三个线程固定大小的线程池
    @Test
    public void testNewFixedThreadPool() {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            pool.execute(new TargetTask());
            pool.submit(new TargetTask());
        }
        sleepSeconds(1000);
        pool.shutdown();
    }

    //测试用例：“可缓存的线程池"
    @Test
    public void testNewCacheThreadPool() {
        ExecutorService pool = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            pool.execute(new TargetTask());
            pool.submit(new TargetTask());
        }
        sleepSeconds(1000);
        pool.shutdown();
    }

    //测试用例：“可调度线程池”
    @Test
    public void testNewScheduledThreadPool() {
        ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(2);
        for (int i = 0; i < 2; i++) {
            scheduled.scheduleAtFixedRate(new TargetTask(), 0, 500, TimeUnit.MILLISECONDS);
            //以上参数中：
            // 0表示首次执行任务单的延迟时间，500表示每次执行任务的间隔时间
            //TimeUnit.MILLISECONDS 执行的时间间隔数值单位为毫秒
        }
        sleepSeconds(1000);
        scheduled.shutdown();
    }

    //测试用例：获取异步调用的结果
    @Test
    public void testSubmit2() {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        Future<Integer> future = pool.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return RandomUtil.randInRange(200, 300);
            }
        });
        try{
            Integer result = future.get();
            Print.tco("异步执行的结果是："+result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sleepSeconds(10);

        //关闭线程池
        pool.shutdown();
    }

}
