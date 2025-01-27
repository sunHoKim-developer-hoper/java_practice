package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV2 {
    
    private int outInstanceVar = 3;

    public Printer process(int paramVar){
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 사라진다.
        
        class LocalPrinter implements Printer {
            int value = 0;

            public void print(){
                System.out.println("value = " + value);
                //인스턴스는지역 변수보다 더 오래 살아 남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

        }
        LocalPrinter printer = new LocalPrinter();
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV2 v2 = new LocalOuterV2();
        Printer printer = v2.process(2);
        //process의 스택 프레임이 사라진 이후에 실행
        printer.print();
        
        System.out.println("필드 확인 !!");
        Field [] fields= printer.getClass().getDeclaredFields();
        for(Field field : fields){
            System.out.println("field : " + field);
        }
    }
}
