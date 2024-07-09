package config;

import exam01.Calculator;
import exam01.RecCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
//@EnableAspectJAutoProxy(proxyTargetClass = true) // true = 서브 클래스 기반 프록시
@EnableAspectJAutoProxy
// AOP 자동 설정 애노테이션
public class AppCtx {

    @Bean
    public ProxyCalculator2 proxyCalculator() {
        return new ProxyCalculator2();
    }

//    @Bean
//    public RecCalculator calculator() {
//        return new RecCalculator();
//    }

    public Calculator calculator() {
        return new RecCalculator();
    }
}
