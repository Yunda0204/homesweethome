package board.services;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class BoardService implements InitializingBean, DisposableBean {
    public void write() {
        System.out.println("글쓰기!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet()!");
        // 초기화하고나서 호출되는 메서드
    }

    @Override
    public void destroy() throws Exception {
        //컨테이너에 있는 객체가 소멸되기 전에 실행
        //(주로 객체 소멸전에 할 작업 예) - 자원 해제 등...)
        System.out.println("destroy()!");
    }
}

