package vijay.javabased.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Vivo vivo=context.getBean(Vivo.class);
        vivo.m1();
    }
}
