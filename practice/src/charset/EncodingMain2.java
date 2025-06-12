package charset;

import java.nio.charset.Charset;
import static java.nio.charset.StandardCharsets.*;
import java.util.Arrays;

public class EncodingMain2 {

    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("== 영문 ASCII 인코딩 ==");
        test("A", US_ASCII, US_ASCII);
        test("A", US_ASCII, ISO_8859_1); // ASCII 확장
        test("A", US_ASCII, EUC_KR); //아스키 포함
        test("A", US_ASCII, MS_949); //아스키 포함
        test("A", US_ASCII, UTF_8); //아스키 포함
        test("A", US_ASCII, UTF_16BE); //아스키 미포함, 디코딩 실패

        System.out.println("\n== 한글 인코딩 기본==");
        test("가", US_ASCII, US_ASCII);
        test("가", ISO_8859_1, ISO_8859_1);
        test("가", EUC_KR, EUC_KR);
        test("가", MS_949, MS_949);
        test("가", UTF_8, UTF_8);

        System.out.println("\n== 한글 인코딩 복잡한 문자==");
        test("뷁", EUC_KR, EUC_KR);
        test("뷁", UTF_8, UTF_8);

        System.out.println("\n== 한글 인코딩 디코딩이 다른 경우==");
        test("뷁", UTF_8, EUC_KR);
        test("뷁", EUC_KR, UTF_8);
        test("뷁", MS_949, UTF_8);
        System.out.println(+123132);
    }   

    private static void test(String text, Charset encodingCharset, Charset decodingCharset) {
        byte[] encoded = text.getBytes(encodingCharset);
        String decoded = new String(encoded, decodingCharset);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte -> [%s] 디코딩 -> %s\n", text, encodingCharset,
                Arrays.toString(encoded),encoded.length,decodingCharset, decoded);
    }
}
