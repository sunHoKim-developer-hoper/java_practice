package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    static Scanner sc = new Scanner(System.in, "MS949");
    static Map<String, String> dic = new HashMap<>();

    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            if (dic.size() == 0) {
                System.out.println("사전에 등록된 단어가 없습니다. 단어 입력 먼저 진행히 필요합니다.");
                selectMenu(1);
            } else {
                showMenu();
            }
        }
    }

    public static void selectMenu(int i) {
        switch (i) {
            case 1:
                while (true) {
                    boolean result = insertToDic();
                    if (result)
                        break;
                }
                break;
            case 2:
                while (true) {
                    boolean result = searchWord();
                    if (result)
                        break;
                }
                break;
            case 3:
                System.out.println("사전에 등록된 단어 모두 출력");
                dic.forEach((k, v) -> {
                    System.out.printf("영문 단어 : %s, 한국어 뜻 : %s\n", k, v);
                });
                break;
            case 4:
                System.out.println("프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                System.out.println("새로 입력해주세요!!");
                break;
        }

    }

    public static void showMenu() {
        System.out.println("\n====메뉴 선택====");
        System.out.println("1. 단어 등록");
        System.out.println("2. 단어 찾기");
        System.out.println("3. 사전 전체 단어 출력");
        System.out.println("4. 프로그램 종료");
        System.out.println("=============");
        String input = sc.nextLine();
        try {
            int menuNum = Integer.parseInt(input);
            selectMenu(menuNum);
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력해주세요!");
        }
    }

    public static boolean insertToDic() {
        String eng = inputEng();
        if (dic.containsKey(eng)) {
            System.out.println("이미 등록된 단어입니다.");
            while (true) {
                System.out.print("재등록 하시겠습니까? (재등록: 1 / 단어 다시 입력: 2 / 종료: q ) : ");
                String option = sc.nextLine();
                if (option.equals("1")) {
                    System.out.print("새로운 한글 뜻 입력 : ");
                    String kor = "";

                    dic.put(eng, kor);
                    System.out.println(eng + " 재등록 완료~");
                    return true;
                } else if ("2".equals(option)) {
                    return false;
                } else if (option.equals("q")) {
                    System.out.println("등록 종료");
                    return true;
                } else {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }
            }
        } else {
            String kor = inputKorean();
            dic.put(eng, kor);
            System.out.println(eng + "등록 완료!!");
            return true;
        }
    }

    public static boolean searchWord() {
        String search = inputEng();
        if (dic.containsKey(search)) {
            System.out.println("해당 단어의 한국어 뜻은 " + dic.get(search) + "입니다.");
            return true;
        } else {
            System.out.println("해당되는 단어를 찾을 수 없습니다!!!!");
            while (true) {
                System.out.print("재검색 하시겠습니까? (재검색: 1 /사전의 모든 단어 확인: 2 / 검색 종료: q ) : ");
                String option = sc.nextLine();
                if ("1".equals(option)) {
                    return false;
                } else if ("2".equals(option)) {
                    System.out.println("========================");
                    System.out.println("사전에 등록된 단어");
                    dic.keySet().forEach(s -> {
                        System.out.print(s + " ");
                    });
                    System.out.println();
                    System.out.println("========================");
                    continue;
                } else if ("q".equals(option)) {
                    System.out.println("검색 종료");
                    return true;
                } else
                    continue;
            }
        }
    }

    private static boolean isEnglish(String s) {
        boolean result = true;
        for (char ch : s.toCharArray()) {
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))) {
                System.out.println("영문 단어만 입력 가능합니다!!");
                return false;
            }
        }
        return result;
    }

    private static boolean isKorean(String s) {
        boolean result = true;
        for (char ch : s.toCharArray()) {
            if (!(ch >= 0xAC00 && ch <= 0xD7A3)) {
                System.out.println("한글만 입력 가능합니다!!");
                return false;
            }
        }
        return result;
    }

    public static String inputKorean() {
        String kor = "";
        while (true) {
            System.out.print("한글 뜻 입력 : ");
            kor = sc.nextLine();
            if (isKorean(kor))
                break;
        }
        return kor;
    }

    public static String inputEng() {
        String eng = "";
        while (true) {
            System.out.print("영문 단어 입력 : ");
            eng = sc.nextLine();
            if (isEnglish(eng))
                break;
        }
        return eng;
    }
}