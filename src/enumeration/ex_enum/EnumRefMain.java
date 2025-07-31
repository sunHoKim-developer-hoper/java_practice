package enumeration.ex_enum;

public class EnumRefMain {
    
    public static void main(String[] args) {
        
        int price = 10000;
        //DiscountService discountService = new DiscountService();

        Grade [] grades = Grade.values();
        for(Grade g : grades){
            printDiscountPrice(g, price);
        }
    }
    private static void printDiscountPrice(Grade grade, int price){

        System.out.println(grade.name() + " 등급의 할인 금액 : " + grade.discount(price));
        
    }
}
