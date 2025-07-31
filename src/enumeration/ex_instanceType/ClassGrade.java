package enumeration.ex_instanceType;

public class ClassGrade {
    
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // 객체 생성을 막는다.
    private ClassGrade(){}
}
