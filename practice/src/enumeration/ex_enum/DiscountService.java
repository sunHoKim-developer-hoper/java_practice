package enumeration.ex_enum;

public class DiscountService {
    
    public int discount(Grade grade, int price){
        int discountPercent = grade.getDiscountPercent();
        return price * discountPercent / 100;
    }
}
