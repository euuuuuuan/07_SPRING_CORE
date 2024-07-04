package com.ohgiraffers.section03.annotationconfig.subsection01.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.ohgiraffers") // 해당 경로의 하위 경로를 전부 스캔
@Configuration("contextConfiguration3")
public class ContextConfiguration {

}
