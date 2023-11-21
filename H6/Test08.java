package H6;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test08 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException {
        Class c1 = Class.forName("H6.User");
        System.out.println(c1);
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
        Field[] fileds = c1.getFields();//只能public属性
        for (Field file : fileds) {
            System.out.println(file);
        }
        fileds = c1.getDeclaredFields(); //全部属性
        for (Field file : fileds) {
            System.out.println(file);
        }
        Field name = c1.getDeclaredField("name");
        System.out.println(name);


        Method[] methods = c1.getMethods();    //获取本类及父类的全部public方法
        for (Method method : methods) {
            System.out.println(method);
        }
        methods = c1.getDeclaredMethods();    //获取本类的全部方法
        for (Method method : methods) {
            System.out.println(method);
        }

        Method getname = c1.getMethod("getNa.me", null); //获取指定方法
        Method setName = c1.getMethod("getNa.me", String.class); //获取指定方法
        Constructor[] ad = c1.getConstructors();
        for (Constructor constructor : ad) {
            System.out.println(constructor);
        }
        Constructor[] ad1 = c1.getDeclaredConstructors();
        for (Constructor constructor : ad1) {
            System.out.println(constructor);
        }
        Constructor ad2 = c1.getConstructor(String.class, int.class, int.class);
        System.out.println(ad2);
        

    }
}
