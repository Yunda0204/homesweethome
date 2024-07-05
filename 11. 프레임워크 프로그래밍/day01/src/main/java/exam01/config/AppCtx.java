package exam01.config;

import exam01.Greeter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 스프링프레임워크 에노테이션
// 설정 클래스 - 스프링 컨테이너가 관리할 객체를 정의, 설정
public class AppCtx {

    @Bean
    public Greeter greeter() {
        return new Greeter();
    }
}
