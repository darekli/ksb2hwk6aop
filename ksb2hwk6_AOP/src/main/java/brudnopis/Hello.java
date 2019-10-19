package brudnopis;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    @EventListener(ApplicationReadyEvent.class)
    @HalloAspect
    public String sayHello() {
        System.out.println("Hello z lkasy Hello");
        return "return Hello z klasy Hello";
    }
}
