package stringClass;

public class CharArrayMain {
    
    public static void main(String[] args) {
        char [] charArr = new char [] {'h','e','l','l','o'};
        System.out.println(charArr);

        String str = "Hello";
        String string = "Hello";
        String s = new String("Hello");
        System.out.println(str == string);
        System.out.println(str == s);

        String joinedString = String.join("-", "a","b","c");
        System.out.println(joinedString);

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.insert(1, "java");
        System.out.println(sb);
        System.out.println(sb.reverse());
    }
}
