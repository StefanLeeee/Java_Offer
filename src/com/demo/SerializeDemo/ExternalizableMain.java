package com.demo.SerializeDemo;

import java.io.*;

/**
 * @author Zhang
 * @date 2021/4/13 14:06
 * @description
 */
public class ExternalizableMain {
    private static final String FILE_PATH = "./person.bin";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("zhangsan", 15);
        System.out.println(person.toString());
        serializable(person, FILE_PATH);
        System.out.println("============反序列化=============");
        person = (Person) deserializable(FILE_PATH);
        System.out.println(person.toString());

    }

    private static void serializable(Object o, String path) throws IOException {
        FileOutputStream boas = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(boas);
        oos.writeObject(o);
        oos.close();
        boas.close();
    }

    private static Object deserializable(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream bis = new ObjectInputStream(new FileInputStream(path));
        Object obj = bis.readObject();
        return obj;
    }
}