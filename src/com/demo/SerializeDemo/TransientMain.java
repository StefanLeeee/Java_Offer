package com.demo.SerializeDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Zhang
 * @date 2021/4/13 13:11
 * @description
 */
public class TransientMain {
    private static final String FILE_PATH = "./transient.bin";

    public static void main(String[] args) throws Exception {
        serializeMyList();
        deserializeMyList();
    }

    private static void serializeMyList() throws Exception {
        System.out.println("序列化...");
        MyList myList = new MyList("ArrayList");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
        oos.writeObject(myList);
        oos.flush();
        oos.close();
    }
    /* 1.如果 private  Object[] arr; 没有使用 transient ，那么整个数组都会被保存，而不是保存实际存储的数据
    输出结果：MyList{name='ArrayList', arr=[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]}
    2.private transient Object[] arr;设置了 transient，表示 arr 元素不进行序列化 输出结果：MyList{name='ArrayList', arr=null}
    3.参考 ArrayList 处理内部的 transient Object[] elementData;
    数组是通过 writeObject 和 readObject 实现的 我们的 MyList 内部也可以借鉴这种方式实现transient元素的手动序列化和反序列化。 */

    private static void deserializeMyList() throws Exception {
        System.out.println("反序列化...");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
        MyList myList = (MyList) ois.readObject();
        ois.close();
        System.out.println(myList);
    }
}