package com.demo;

/**
 * @author Zhang
 * @date 2021/4/9 10:27
 * @description
 */
public class ChildTest extends FatherTest{
    public void ChildTest(){
        System.out.println("Print ChildTest");
    }

    public static void main(String[] args) {
        FatherTest fatherTest = new FatherTest();
        ChildTest childTest = new ChildTest();
        childTest.ChildTest();
    }
}
