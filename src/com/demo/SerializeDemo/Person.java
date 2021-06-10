package com.demo.SerializeDemo;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * @author Zhang
 * @date 2021/4/13 14:04
 * @description
 */
public class Person implements Externalizable {
    private static final long serialVersionUID = -7424420983806112577L;
    private String name;
    private int age; /* 实现了Externalizable这个接口需要提供无参构造，在反序列化时会检测 */

    public Person() {
        System.out.println("Person: empty");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("person writeExternal...");
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
        System.out.println("person readExternal...");
        name = (String) in.readObject();
        age = in.readInt();
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}