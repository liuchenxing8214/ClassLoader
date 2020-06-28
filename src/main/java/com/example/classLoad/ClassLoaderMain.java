package com.example.classLoad;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassLoaderMain {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, InvocationTargetException, InvocationTargetException {
        //这个类class的路径
        String classPath = "D:\\work_mcn\\demo\\src\\main\\java\\com\\example\\classLoad\\Person.java";
        MyClassLoader myClassLoader = new MyClassLoader(classPath);
        //类的全称
        String packageNamePath = "com.example.classLoad.Person";
        //加载Person这个class文件
        Class<?> person = myClassLoader.loadClass(packageNamePath);
        System.out.println("类加载器是:" + person.getClassLoader());
        //利用反射获取hello方法
        Method method = person.getDeclaredMethod("hello");
        Object object = person.newInstance();
        method.invoke(object);
    }
}
