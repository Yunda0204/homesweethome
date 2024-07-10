package configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
// 100줄 대신 써주는 어노테이션, 무적권 외울 것
public class MvcConfig implements WebMvcConfigurer {
    // WebMvcConfigurer << 인터페이스들 외울 것, 무적권

    /* 그냥 씨발 여기 다 외우셈 ㅋㅋ */

    /* 이 새끼 무조건 외우셈 중요함 S */
    // ctrl + o 눌러서 메서드 확인하셈
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/templates/", ".jsp");
    }
    /* 이 새끼 무조건 외우셈 중요함 S */
}
