package exam01;

import config.AppCtx;
import mappers.member.MemberMapper;
import member.entities.Member;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//자동적으로 롤백
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = AppCtx.class)
public class Ex03 {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    void test1() {
        long total = memberMapper.getTotal();
        System.out.println(total);
    }

    @Test
    void test2() {
        Member member = Member.builder()
                .email("qwer99@naver.com")
                .password("qwer1234")
                .userName("류다혜")
                .build();
        int result = memberMapper.register(member);

        Member member2 = memberMapper.get(member.getEmail());
        System.out.println(member2);
    }
}
