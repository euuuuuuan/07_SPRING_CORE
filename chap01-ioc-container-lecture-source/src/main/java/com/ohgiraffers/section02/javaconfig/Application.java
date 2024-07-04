package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ContextConfiguration.class);


        MemberDTO member = context.getBean("getMember", MemberDTO.class);

        // ID 값을 기존 메소드명 getMember가 아닌 @Bean 안에 괄호를 통해 설정해줄 수 있다. 'member'로 호출함.
        MemberDTO member2 = context.getBean("member", MemberDTO.class);
        
        System.out.println(member);
    }
}
