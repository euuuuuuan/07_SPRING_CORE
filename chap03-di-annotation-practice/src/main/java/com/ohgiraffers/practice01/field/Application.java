package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.practice01.field");

        MemberService memberService = context.getBean("memberServiceField", MemberService.class);

//        Map<Long, MemberDTO> members = memberService.selectMember();

//        for (Map.Entry<Long, MemberDTO> entry : members.entrySet()) {
//            System.out.println("ID: " + entry.getKey() + ", Member: " + entry.getValue());
//        }
        System.out.println(memberService.selectMember());
    }
}
