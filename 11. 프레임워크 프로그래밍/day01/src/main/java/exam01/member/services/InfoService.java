package exam01.member.services;

import exam01.member.dao.MemberDao;
import exam01.member.entities.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

@Service
public class InfoService {

    private MemberDao memberDao;
    private DateTimeFormatter formatter;

    @Autowired
    public void setMemberDao(Optional<MemberDao> opt) {
        this.memberDao = opt.get();
    }

    // 메서드 자체를 호출 안함
    //    @Autowired(required = false) // DateTimeFormatter 빈이 없으면 호출 X
    //    public void setFormatter(DateTimeFormatter formatter) {
    //        System.out.println("호출!");
    //        this.formatter = formatter;
    //    }

    // 메서드는 호출되지만 없는 의존성에는 null을 대입
    @Autowired
    public void setFormatter(@Nullable DateTimeFormatter formatter) {
        System.out.println("호출!");
        this.formatter = formatter;
    }

    @Autowired
    public void printList() {
        List<Member> members = memberDao.getList();
        members.forEach(member -> {
            System.out.println(member);
            LocalDateTime regDt = member.getRegDt();
            if (formatter != null) {
                System.out.println(formatter.format(regDt));
            }
        });

    }

}
