package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProxyCalculator {

    @Pointcut("execution(* exam01..*(..))")
    // 이 범위가 method  실행 할 범위를 지정
    public void publicTarget() {

    }

    @Around("publicTarget()")
    public Object process(ProceedingJoinPoint joinPoint) throws Throwable {

        System.out.println("publicTarget 유입!");

        Object result = joinPoint.proceed();
        // 핵심 기능 대신 실행 - factorial

        return result;
    }
}
