package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {
    public static void main(String[] args) throws IllegalAccessException {
        // 自动装配的过程
        A a = new A();
        Class<? extends A> clazz = a.getClass();
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            Autowired autowired = field.getAnnotation(Autowired.class);
            if (autowired != null) {
                Class fieldClass = field.getType();  // 在这里就是B.class
                B b = null;
                try {
                    b = (B) fieldClass.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
                field.set(a, b);
            }
        }
        ConcurrentHashMap map = new ConcurrentHashMap<>();


        Map map1 = new HashMap();

        // 测试 打印输出
        a.printBName();  // defuli
    }
}
