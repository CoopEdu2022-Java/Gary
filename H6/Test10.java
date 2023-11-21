package H6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test10 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException, SecurityException {
        MyClass myClass = new MyClass();

        // 直接调用方法
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            myClass.myMethod();
        }
        long endTime = System.nanoTime();
        long directTime = endTime - startTime;
        System.out.println("Direct call time: " + directTime + " ns");

        // 使用反射调用方法
        Method method = MyClass.class.getDeclaredMethod("myMethod");
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            method.invoke(myClass);
        }
        endTime = System.nanoTime();
        long reflectionTime = endTime - startTime;
        System.out.println("Reflection call time: " + reflectionTime + " ns");

        // 比较性能差异
        double performanceRatio = (double) reflectionTime / directTime;
        System.out.println("Performance ratio: " + performanceRatio);
    }

    public static class MyClass {
        public void myMethod() {
            // do something
        }
    }
}
