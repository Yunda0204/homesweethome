package exam01;

import exam01.config.APpCtx3;
import exam01.config.AppCtx;
import exam01.member.controllers.RequestJoin;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex04 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(APpCtx3.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = RequestJoin.builder()
                .email("Yunda03@naver.com")
                .password("qwer1234")
                .confirmPassword("qwer1234")
                .userName("윤다은")
                .RegDt(LocalDateTime.now())
                .build();

        joinService.process(form);

        infoService.printList();

        ctx.close();
    }
}
