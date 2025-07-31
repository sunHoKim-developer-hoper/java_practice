package clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    
    public static void main(String[] args) throws Exception{
        // 클래스 조회 3 가지 방식이 있다.
        Class<?> clazz = String.class; 
        //new String().getClass();
        //Class.forName("java.lang.String");
    
        // 모든 필드 출력
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields){
            System.out.println("field " + field);
        }
        // 메서드 정보
        Method[] Method = clazz.getDeclaredMethods();
        // 부모 클래스 정보
        clazz.getSuperclass();

        // 구현한 인터페이스 정보
        Class[] interfaces = clazz.getInterfaces();
        
    }
}
