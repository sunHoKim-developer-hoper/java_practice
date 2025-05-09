package annotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnotationProcessor {
    
    public static void main(String[] args) {
        
        Class<?> clazz = Example.class;
        //클래스 어노테이션
        if(clazz.isAnnotationPresent(MyAnnotation.class)){
            System.out.println("Class : " + clazz.getAnnotation(MyAnnotation.class).value());
        }

        //필드 어노테이션
        for(Field filed : clazz.getDeclaredFields()){
            if(filed.isAnnotationPresent(MyAnnotation.class)){
                System.out.println("Field : " + filed.getAnnotation(MyAnnotation.class).value());
            }
        }

        //생성자 어노테이션
        for(Constructor<?> constructor : clazz.getDeclaredConstructors()){
            if(constructor.isAnnotationPresent(MyAnnotation.class)){
                System.out.println("Constructor: " + constructor.getAnnotation(MyAnnotation.class).value());
            }
            //생성자의 파라메터
            for(Parameter param : constructor.getParameters()){
                if(param.isAnnotationPresent(MyAnnotation.class)){
                    System.out.println("param: " + param.getAnnotation(MyAnnotation.class).value());
                }
            }
        }
        //메서드 어노테이션 및 파라메터
        for(Method method : clazz.getDeclaredMethods()){
            if(method.isAnnotationPresent(MyAnnotation.class)){
                System.out.println("Method: " + method.getAnnotation(MyAnnotation.class).value());
            }
            for(Parameter param : method.getParameters()){
                System.out.println("Method Param: " + param.getAnnotation(MyAnnotation.class).value());
            }
        }
    }
}
