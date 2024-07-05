package exam01;

import exam01.config.AppCtx2;
import exam01.member.controllers.RequestJoin;
import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import exam01.member.services.InfoService;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalDateTime;

public class Ex03 {

    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx2.class);

        JoinService joinService = ctx.getBean(JoinService.class);
        InfoService infoService = ctx.getBean(InfoService.class);

        RequestJoin form = RequestJoin.builder()
                .email("qwer@naver.com")
                .password("qwer1234")
                .confirmPassword("qwer1234")
                .userName("민설희")
                .RegDt(LocalDateTime.now())
                .build();


        joinService.process(form);
        infoService.printList();

        ctx.close();
    }
}
