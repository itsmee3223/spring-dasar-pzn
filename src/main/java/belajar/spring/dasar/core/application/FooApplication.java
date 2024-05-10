package belajar.spring.dasar.core.application;

import belajar.spring.dasar.core.data.Bar;
import belajar.spring.dasar.core.data.Foo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FooApplication {
    @Bean
    public Foo foo(){
        return new Foo();
    }

//    error no Bar bean
//    @Bean
//    public Foo foo2(Bar bar){
//        return new Foo();
//    }

    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
        Foo foo = applicationContext.getBean(Foo.class);

        System.out.println(foo);
    }

}
