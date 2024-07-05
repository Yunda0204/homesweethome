package exam01.config;

import exam01.member.dao.MemberDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.time.format.DateTimeFormatter;

@Configuration
//@ComponentScan(basePackages = "exam01.member")
@ComponentScan("exam01.member") // 멤버안의 모든걸 컨테이너에 넣음
public class APpCtx3 {

//    @Bean // 수동등록 Bean vs 자동등록 Bean 있으면 수동등록 Bean 생성이 우선임
//    public MemberDao memberDao() {
//        System.out.println("수동등록 Bean");
//        return new MemberDao();
//    }


    @Bean // 자바 JDK, 외부 라이브러리는 Bean 수동 등록이 필수
    public DateTimeFormatter dateTimeFormatter() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm");

        return formatter;
    }
}
