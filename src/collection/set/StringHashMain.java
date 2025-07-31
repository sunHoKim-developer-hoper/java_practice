package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;
    
    public static void main(String[] args) {
        char charA = 'A';
        System.out.println("charA = " + (int)charA);
        
        System.out.println("hashCode('A') : " + hashCode("A"));
        System.out.println("hashCode('B') : " + hashCode("B"));
        System.out.println("hashCode('AB') : " + hashCode("AB"));

        int hashIndex = hashIndex(hashCode("A"));
        System.out.println("Hash Index Of A is " + hashIndex);
    }
    static int hashCode(String str){
        char [] charAryy  = str.toCharArray();
        int sum = 0;
        for (char c : charAryy) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int value){
        return value % CAPACITY;
    }
}
