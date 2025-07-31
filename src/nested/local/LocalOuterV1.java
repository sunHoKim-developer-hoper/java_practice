package nested.local;

public class LocalOuterV1 {
    
    private int outInstanceVar = 3;

    public void process(int paramVar){
        int localVar = 1;
        
        class LocalPrinter implements Printer {
            int value = 0;
            public void print(){
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }

        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV1 v1 = new LocalOuterV1();
        v1.process(2);
    }
}
