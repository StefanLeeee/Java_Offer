package com.demo.SerializeDemo;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

/**
 * @author Zhang
 * @date 2021/4/13 14:02
 * @description
 */
public interface Externalizable extends Serializable {
    //将要序列化的对象属性通过 var1.wrietXxx() 写入到序列化流中
    void writeExternal(ObjectOutput var1) throws IOException;

    //将要反序列化的对象属性通过 var1.readXxx() 读出来
    void readExternal(ObjectInput var1) throws IOException, ClassNotFoundException;
}