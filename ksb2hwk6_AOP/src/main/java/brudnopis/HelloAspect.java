package brudnopis;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

    @After("@annotation(HalloAspect)")
    private void beforeHello(){
        System.out.println("beforeHello w klasie HellAspect");

    }
}
