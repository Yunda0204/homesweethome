package org.choongang.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Configuration
@EnableWebMvc
@ComponentScan("org.choongang")
/*
@Import({DBConfig.class,
        MessageConfig.class,
        InterceptorConfig.class,
        FileConfig.class}) */
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

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigurer() {
        String fileName = "application";
        String profile = System.getenv("spring.profiles.active");
        fileName += StringUtils.hasText(profile) ? "-" + profile:"";

        /**
         * spring.profiles.active=dev
         * -> application-dev
         *
         * spring.profiles.active=prod
         * -> application-prod
         */

        PropertySourcesPlaceholderConfigurer conf = new PropertySourcesPlaceholderConfigurer();
        conf.setLocations(new ClassPathResource(fileName + ".properties"));

        return conf;
    }

    @Override
    public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        ObjectMapper objectMapper = Jackson2ObjectMapperBuilder
                .json()
                .serializerByType(LocalDateTime.class, new LocalDateTimeSerializer(formatter))
                .build();

        converters.add(0, new MappingJackson2HttpMessageConverter(objectMapper));
    }
}