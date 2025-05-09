package charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.SortedMap;

public class AvailableCharactersetsMain {
    
    public static void main(String[] args) {
        
        //이용 가능한 모든 Charset 자바 + OS
        SortedMap<String, Charset> charsets = Charset.availableCharsets();
        for(String charsetName : charsets.keySet()){
            System.out.println("charsetName : " + charsetName);
        }
        
        System.out.println("=======");
        Charset charset1 = Charset.forName("MS949");
        Set<String> aliases = charset1.aliases();
        
        for (String alias : aliases) {
            System.out.println("alias = " + alias);
        }
        
        // UTF-8 문자로 조회
        Charset charset2 = Charset.forName("UTF-8");
        System.out.println("charset2 : " + charset2);
        
        // 자주 사용되는 문자 집합은 상수로 정의되어 있다.
        Charset charset3 = StandardCharsets.UTF_8;
        System.out.println("charset3 : " + charset3);

        // 시스템의 기본 Charset 조회
        Charset defaulCharset = Charset.defaultCharset();
        System.out.println("default Charset : " + defaulCharset);
    }
}
