package com.demo.SerializeDemo;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author Zhang
 * @date 2021/4/13 11:03
 * @description
 */


public class MyList implements Serializable {
    private String name;
    /* transient 表示该成员 arr 不需要被序列化 */
    private transient Object[] arr;

    public MyList() {
    }

    public MyList(String name) {
        this.name = name;
        this.arr = new Object[100]; /* 给前面30个元素进行初始化 */
        for (int i = 0; i < 30; i++) {
            this.arr[i] = i;
        }
    }

    @Override
    public String toString() {
        return "MyList{" + "name='" + name + '\'' + ", arr=" + Arrays.toString(arr) + '}';
    } //-------------------------- 自定义序列化反序列化 arr 元素 ------------------

    // /** * Save the state of the ArrayList instance to a stream (that * is, serialize it). *
    // * @serialData The length of the array backing the ArrayList * instance is emitted (int),
    // followed by all of its elements * (each an Object) in the proper order. */
    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException { //执行 JVM 默认的序列化操作
        s.defaultWriteObject();
        //手动序列化 arr  前面30个元素
        for (int i = 0; i < 30; i++) {
            s.writeObject(arr[i]);
        }
    }

    /**
     * Reconstitute the ArrayList instance from a stream (that is, * deserialize it).
     */
    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException {
        s.defaultReadObject();
        arr = new Object[30];
        // Read in all elements in the proper order.
        for (int i = 0; i < 30; i++) {
            arr[i] = s.readObject();
        }
    }
}