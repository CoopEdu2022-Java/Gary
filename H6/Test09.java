package H6;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test09 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, NoSuchFieldException {
        Class c1 = Class.forName("H6.User");
        User user = (User) c1.getDeclaredConstructor().newInstance();//获取无参构造器
        Constructor constructor = c1.getDeclaredConstructor();//获取无参构造器
        User user2 = (User) constructor.newInstance();
        System.out.println(constructor);//
        Method setName = c1.getDeclaredMethod("setName", String.class);//获取指定方法
        setName.invoke(user, "张三");//调用方法
        //不能直接操作私有属性
        Field name = c1.getDeclaredField("name");//获取指定属性
        name.setAccessible(true);//设置可访问
        name.set(user, "李四");//设置属性值
        

    }
}
