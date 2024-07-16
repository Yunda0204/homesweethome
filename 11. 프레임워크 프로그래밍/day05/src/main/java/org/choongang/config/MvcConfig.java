package org.choongang.config;

import lombok.RequiredArgsConstructor;
import org.choongang.member.validators.JoinValidator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
@ComponentScan("org.choongang")
@Import({DBConfig.class, MessageConfig.class, InterceptorConfig.class})
//@RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {
/*
    private final JoinValidator joinValidator; // 보여주기 위한 예시, 이렇게 안씀

    @Override
    public Validator getValidator() { // 모든 컨트롤러에 적용 될 수 있는 validator
        return joinValidator;
    }
*/
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) { // 정적 경로 지정
        registry.addResourceHandler("/**") // ** 두개는 모든 하위 경로 지정 * 한개는 지정 경로만
                .addResourceLocations("classpath:/static/");

    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) { // 기본메인페이지
        registry.addViewController("/")
                .setViewName("main/index");

        registry.addViewController("/mypage")
                .setViewName("mypage/index");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/templates/", ".jsp");
    }
}