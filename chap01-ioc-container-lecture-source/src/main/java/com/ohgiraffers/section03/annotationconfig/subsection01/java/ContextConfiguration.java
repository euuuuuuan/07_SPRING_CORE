package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import com.ohgiraffers.common.MemberDAO;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

// 1.
//@ComponentScan(basePackages = "com.ohgiraffers") // 해당 경로의 하위 경로를 전부 스캔

// 2.
//@ComponentScan(basePackages = "com.ohgiraffers",
//        excludeFilters = {
//                // excludeFilters : 특정 조건에 맞는 클래스를 스캔에서 제외시칸다.
//                @ComponentScan.Filter(
//                        // 1. 타입으로 설정
////                        type = FilterType.ASSIGNABLE_TYPE,
////                        classes = {MemberDAO.class}
//
//                        // 2. 어노테이션 종류로 설정
////                        type = FilterType.ANNOTATION,
////                        classes = {org.springframework.stereotype.Component.class}
//                )
//        })
// 3.
@ComponentScan(basePackages = "com.ohgiraffers",
        // 기본 어노테이션( @Component, @Service, @Repository, @Controller )을
        // 가진 클래스들이 자동으로 스캔된다.
        useDefaultFilters = false,
        includeFilters = {
                // includeFilters: 기본 필터 이외에 추가로 포함시키고 싶은 클래스를 스캔할 수 있다.
                @ComponentScan.Filter(
                        type = FilterType.ASSIGNABLE_TYPE,
                        classes = {MemberDAO.class}
                )
        }
)
@Configuration("contextConfiguration3")
public class ContextConfiguration {

}
