package com.java.product_consume;

/**
 * @author Zhang
 * @date 7/8/2021 6:02 PM
 * @description
 */
public class Product {

    public int product = 0;
    public final static int MAX = 999;
    public final static int MIN = 0;
    public synchronized void produce() {
        if (this.product >= MAX) {
            try{
                wait();
                System.out.println("仓库已满，请等会再生产");
            } catch (InterruptedException e) {
                System.out.println("wait方法异常");
            }
            return;
        }
        this.product++;
        System.out.println("+++正在生产第 " + this.product + "个产品");
        notifyAll();
    }

}
