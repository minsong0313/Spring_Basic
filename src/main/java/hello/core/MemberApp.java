package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        //memberA라는 이름의 회원을 생성하고 회원가입
        MemberService memberService = new MemberServiceImpl();
        Member member = new Member(1L, "memberA", Grade.VIP); //id는 Long타입이니까 숫자뒤에 L붙여줘야함
        memberService.join(member);

        //등록된 id로 회원조회
        Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName()) ;

    }

    /*
    순수자바로 구현
    애플리케이션 로직으로 메인메서드를 테스트 하는건 한계가 있음, 좋은 방법이 아님
    -> Junit을 사용해야함
     */
}
