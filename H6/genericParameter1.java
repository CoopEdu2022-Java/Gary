package H6;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;

import javax.lang.model.element.Parameterizable;
import javax.sound.sampled.AudioFileFormat.Type;

public class genericParameter1 {
    public void test01(Map<String, Integer> map) {
        System.out.println("test01");
    }
    public Map<String, Integer> test02() {
        System.out.println("test02");
        return null;
    }
    public static void main(String[] args) throws NoSuchMethodException, SecurityException {
        Method method = genericParameter1.class.getMethod("test01", Map.class,List.class);
        Type[] genericPrameterTpyes = (Type[]) method.getGenericParameterTypes();
        for (Type genericPrameterTpye:genericPrameterTpyes) {
            System.out.println("#"+genericPrameterTpye);
            if (genericPrameterTpye instanceof ParameterizedType){
                Type[] actualTypeArguments = (Type[]) ((ParameterizedType) genericPrameterTpye).getActualTypeArguments();
                for (Type actualTypeArgument:actualTypeArguments) {
                    System.out.println(actualTypeArgument);
                }

            }

        }
    }
}
