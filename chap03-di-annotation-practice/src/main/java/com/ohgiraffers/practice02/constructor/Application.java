package com.ohgiraffers.practice02.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        // 스프링 컨텍스트 생성
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.practice02.constructor");
        // ApplicationContext를 생성할 때 Java Config를 사용하여
        // 스프링 앱 컨텍스트를 설정했음.
        // AnnotaationConfigAppConfigApplicationContext를 사용하여
        // 해당 경로의 constructor 패키지를 스캔하고,
        // 해당 패키지 내의 클래스들을 Spring Bean으로 등록하게 됨.

        // MemberService 빈 가져오기
        MemberService memberService = context.getBean("memberServiceField", MemberService.class);

        // MemberController의 selectMember() 메소드를 호출하여
        // MemberService를 통해 데이터 가져오기
        System.out.println(memberService.selectMember());
    }
}
