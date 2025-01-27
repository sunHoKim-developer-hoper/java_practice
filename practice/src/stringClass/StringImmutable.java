package stringClass;

public class StringImmutable {
    
    public static void main(String[] args) {
        String str = "hello";
        str = str.concat("java");
        System.out.println(str);

        char [] o = {'h','e','l','l','o'};
        char [] c = new char[5];
        System.arraycopy(o, 0, c, 0, o.length);
        System.out.println(c);
    }
}
