package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.ohgiraffers.practice01.field");

        MemberService memberService = context.getBean("memberServiceField", MemberService.class);

        List<MemberDTO> members = (List<MemberDTO>) memberService.selectMember();

        for (MemberDTO memberDTO : members) {
            System.out.println(memberDTO);
        }

        System.out.println(memberService.selectMember());

    }
}
