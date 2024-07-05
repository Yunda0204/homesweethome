package exam01;

import exam01.member.Assembler;
import exam01.member.controllers.RequestJoin;
import exam01.member.controllers.RequestLogin;
import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import exam01.member.services.JoinService;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Ex02 {

    @Test
    void test1() {
        Assembler assembler = new Assembler();
        JoinService joinService = assembler.joinService();
        MemberDao memberDao = assembler.memberDao();

        RequestJoin form = RequestJoin.builder()
                .email("qwer1234@naver.com")
                .password("qwer1234")
                .confirmPassword("qwer1234")
                .userName("윤다은")
                .build();

        joinService.process(form);

        List<Member> members = memberDao.getList();

        members.forEach(System.out::println);
    }
}
