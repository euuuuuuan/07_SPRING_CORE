package com.ohgiraffers.practice01.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    public static Long SINGLETON_COUNT = 1L;
    public static Long PROTOTYPE_COUNT = 1L;

    /* 위의 정적 변수를 활용하여 빈 등록 코드 작성 */



    @Bean
    @Scope("singleton")
    public SingletonBean singletonBean() {
        String message = SINGLETON_COUNT++ + "번째 메시지";
        return new SingletonBean(message);
    }

    @Bean
    @Scope("prototype")
    public PrototypeBean prototypeBean() {
        String message = PROTOTYPE_COUNT++ + "번째 메시지";
        return new PrototypeBean(message);
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public InitDestroyBean initDestroy() {
        return new InitDestroyBean();
    }
}
