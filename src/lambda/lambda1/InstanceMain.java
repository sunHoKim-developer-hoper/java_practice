package lambda.lambda1;

import lambda.Procedure;

public class InstanceMain {
    
        public static void main(String[] args) {
            Procedure procedure = new Procedure() {
                @Override
                public void run() {
                    System.out.println("hello! lambda");      
                }
            };
            System.out.println("익명 Class : " + procedure.getClass());
            Procedure procedure1 = () -> {System.out.println("hello! lambda");};
            System.out.println("Lambda Class : " + procedure1.getClass());
        }
}
