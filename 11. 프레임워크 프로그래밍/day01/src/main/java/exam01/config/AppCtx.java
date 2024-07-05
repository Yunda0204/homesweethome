package exam01.config;

import exam01.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Import(value = {AppCtx2.class})
//@Import({AppCtx2.class})
@Import(AppCtx2.class)
// 값이 하나만 있으면 중괄호 및 value 생략 가능

@Configuration
// 스프링프레임워크 에노테이션
// 설정 클래스 - 스프링 컨테이너가 관리할 객체를 정의, 설정
public class AppCtx {

    @Bean
    public Greeter greeter() {
        return new Greeter();
    }
}
