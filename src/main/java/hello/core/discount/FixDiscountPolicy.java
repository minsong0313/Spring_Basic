package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("fixDiscountPolicy")
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000; //1000원 고정 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) { //enum타입은 == 사용하는게 맞음
            return discountFixAmount;
        }else {
            return 0;
        }
    }
}
