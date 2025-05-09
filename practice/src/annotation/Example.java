package annotation;

@MyAnnotation("클래스에 적용")
public class Example {
    
    @MyAnnotation("필드에 적용")
    private String value;
    
    @MyAnnotation("생성자에 적용")
    public Example(@MyAnnotation("생성자 파라메터에 적용")String value) {
        this.value = value;
    }

    @MyAnnotation("메서드에 적용")
    public void greet(@MyAnnotation("메서드 파라미터에 적용") String message){
        String output = "Hello," + value + "!" + message;
        System.out.println(output);
    }
}
