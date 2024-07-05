package com.ohgiraffers.section01.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    // XML 설정 파일을 기반으로 ApplicationContext 생성
    public static void main(String[] args) {
        ApplicationContext context = new GenericXmlApplicationContext("section01/xmlconfig/spring-context.xml");

        MemberDTO member = context.getBean(MemberDTO.class);

        System.out.println(member);
        // MemberDTO의 PersonalAccount 객체 출력
        System.out.println(member.getPersonalAccount());

        // 10,000원 입금
        System.out.println(member.getPersonalAccount().deposit(10000));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // 5,000원 출금
        System.out.println(member.getPersonalAccount().withdraw(5000));

        // 잔액 출력
        System.out.println(member.getPersonalAccount().getBalance());

        // Member에서 꺼내온 Personal Account
        // personalAccount=PersonalAccount(bankCode=20, accNo=110-234-56780, balance=110-234-56780 계좌의 현재 잔액은 0원 입니다.)
        // PersonalAccount(bankCode=20, accNo=110-234-56780, balance=110-234-56780 계좌의 현재 잔액은 0원 입니다.)
    }
}
