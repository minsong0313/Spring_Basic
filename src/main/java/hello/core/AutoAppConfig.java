package hello.core;

import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan (//ComponentAnnotation이 붙은 클래스를 찾아서 자동으로 스프링빈에 등록해줌
        basePackages = "hello.core.member", // 탐색할 패키지의 시작위치를 지정
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)//제외할 것을 지정해줌
)

public class AutoAppConfig {

    /*
    @Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

     */

}
