package reflectionExample;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Created by oguzhanonder - 11.06.2018
 */
public class ReflectionTestMain {
    public static void main(String[] args) throws Exception {
        Object reflectionTest = new ReflectionTest();

        Class<?> cls = Class.forName("reflectionExample.ReflectionTest"); // class adından nesne oluşturdum

        System.out.println("Modifiers : " + cls.getModifiers());

        ///Class cls  = reflectionTest.getClass();
        System.out.println("Class Name : "+cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println(constructor.getName());

        System.out.println("Public Methods ---  ");
        Method[] methods = cls.getMethods();
        Arrays.asList(methods).stream().forEach(f-> System.out.println(f.getName()));

        System.out.println("Invoke Method");
        Method methodCall1= cls.getDeclaredMethod("method2", int.class);
        methodCall1.invoke(reflectionTest,20);

        Field field = cls.getDeclaredField("s");
        field.setAccessible(true);
        field.set(reflectionTest,"java");

        Method methodCall2 = cls.getDeclaredMethod("method1");
        methodCall2.invoke(reflectionTest);

        Method methodCall3 = cls.getDeclaredMethod("method3");
        methodCall3.setAccessible(true);
        methodCall3.invoke(reflectionTest);
    }
}
