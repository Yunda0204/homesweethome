package exam01;

import exam01.config.AppCtx;
import exam01.config.AppCtx2;
import exam01.member.controllers.RequestJoin;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex03 {

    @Test
    void test1() {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext("exam01.config");

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        JoinService joinService = ctx.getBean(JoinService.class); // APpCtx2
        InfoService infoService = ctx.getBean(InfoService.class); // APpCtx2

        RequestJoin form = RequestJoin.builder()
                .email("qwer@naver.com")
                .password("qwer1234")
                .confirmPassword("qwer1234")
                .userName("민설희")
                .RegDt(LocalDateTime.now())
                .build();


        joinService.process(form);
        infoService.printList();

        Greeter g1 = ctx.getBean(Greeter.class); // AppCtx
        g1.hello("차두현");

        ctx.close();
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class, AppCtx2.class);


    }
}
