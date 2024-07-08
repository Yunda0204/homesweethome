package config;

import board.services.BoardService2;
import global.annotations.ManualBean;
import member.dao.MemberDao;
import member.validators.JoinValidator;
import org.springframework.context.annotation.*;

/*
@Configuration
@ComponentScan(basePackages = "member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = ManualBean.class)
)
@ComponentScan(basePackages = "member",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {MemberDao.class, JoinValidator.class})
)
@ComponentScan(basePackages = "member",
    excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "member\\.*\\w*Dao")
)
@ComponentScan(basePackages = "member",
    excludeFilters = @ComponentScan.Filter(type = FilterType.ASPECTJ, pattern = "member..*Dao")
)
 */
@ComponentScan({"member", "board"})
public class AppCtx {

    @Scope("Prototype")
    // 호출할때마다 매번 새로운 객체 생성 (Prototype은 거의 쓰지않음)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    // 외부 라이브러리에서 가져온 메서드를 객체 초기화때, 소멸때 실행되도록 만드는 애노테이션
    public BoardService2 boardService2() {
        return new BoardService2();
    }
}