package com.crazymakercircle.charpter1;

import com.crazymakercircle.util.Print;
import com.crazymakercircle.util.ThreadUtil.*;
import sun.applet.resources.MsgAppletViewer_zh_CN;

import java.util.concurrent.atomic.AtomicInteger;

import static com.crazymakercircle.util.ThreadUtil.sleepMilliSeconds;

/**
 * @author Zhang
 * @date 8/9/2021 1:25 PM
 * @description
 */
public class SalesDemo {
    public static final int MAX_AMOUNT = 5; //

    public static String getCurThreadName() {
        return Thread.currentThread().getName();
    }

    static class StoreGoods extends Thread {
        StoreGoods(String name) {
            super(name);
        }

        private int goodsAmount = MAX_AMOUNT;

        public void run() {
            for (int i = 0; i < MAX_AMOUNT; i++) {
                if (this.goodsAmount > 0) {
                    Print.cfo(getCurThreadName() + "卖出一件，还剩：" + (--goodsAmount));
                    sleepMilliSeconds(10);
                }
            }
            Print.cfo(getCurThreadName() + "运行结束。");
        }
    }

    //商场商品类型（target销售线程的目标类），一个商品最多可以销售四次，可以多人销售
    static class MallGoods implements Runnable {
        //多人销售可能导致数据出错，使用原子数据类型保障数据安全
        private AtomicInteger goodsAmount = new AtomicInteger(MAX_AMOUNT);

        @Override
        public void run() {
            for (int i = 0; i < MAX_AMOUNT; i++) {
                if (this.goodsAmount.get() > 0) {
                    Print.cfo(getCurThreadName() + "卖出一件，还剩：" + (goodsAmount.decrementAndGet()));
                    sleepMilliSeconds(10);
                }
            }
            Print.cfo(getCurThreadName() + "运行结束！ ");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Print.cfo("商店版本的销售");
        for (int i = 1; i <= 2; i++) {
            Thread thread = null;
            thread = new StoreGoods("店员-" + i);
            thread.start();

        }
        Thread.sleep(1000);
        Print.cfo("商场版本销售");
        MallGoods mallGoods = new MallGoods();
        for (int i = 1; i < 2; i++) {
            Thread thread = null;
            thread = new Thread(mallGoods, "商场销售员-" + i);
            thread.start();
        }
        Print.cfo(getCurThreadName()+"运行结束");
    }

}
