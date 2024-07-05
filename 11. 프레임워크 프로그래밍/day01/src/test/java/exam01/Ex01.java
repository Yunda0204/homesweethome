package exam01;

import exam01.config.AppCtx;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Ex01 {
    @Test
    void test1() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        // 스프링 컨테이너 객체, 매개변수가 class class인 점을 생각 할 것.

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        g1.hello("윤다은");
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        g2.hello("민설희");
        // greeter 라는 메서드를 컨테이너에서 찾아 꺼내서 객체로 사용 가능

        System.out.println(g1 == g2); // true, 싱글톤 형태로 관리하여 주소 동일

        ctx.close();
    }

    @Test
    void Test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

        // 싱글톤으로 기본 관리하므로 객체가 한개만 있는 경우가 많다
        // Class 클래스만 있어도 찾는다.
        Greeter g1 = ctx.getBean(Greeter.class);

        g1.hello("차두현");

        ctx.close();
    }
}
