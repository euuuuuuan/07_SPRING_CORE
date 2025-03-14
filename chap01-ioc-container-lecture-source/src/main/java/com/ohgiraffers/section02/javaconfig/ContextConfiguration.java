package com.ohgiraffers.section02.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {

    @Bean("member") // ID 값을 getMember가 아닌 @Bean 안에 괄호를 통해 설정해줄 수 있다. 'member'로 호출함.
    public MemberDTO getMember() {
        System.out.println("getMember 호출함...");
        return new MemberDTO(1, "user01", "pass01", "홍길동");
    }
}
