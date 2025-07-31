package nested;

public class ShowingMain {
    
    public int value = 1;

    class Inner {
        public int value = 2;

        void go(){
            int value = 3;
            System.out.println("지역변수 (value) : " + value);
            System.out.println("instance 변수 (this.value) : " + this.value);
            System.out.println("outter 변수 (OutterClassName.this.value) : " + ShowingMain.this.value);
        }
    }
    public static void main(String[] args) {
        ShowingMain main = new ShowingMain();
        Inner i = main.new Inner();
        i.go();
    }
}


