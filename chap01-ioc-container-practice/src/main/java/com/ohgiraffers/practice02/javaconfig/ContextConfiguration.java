package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContextConfiguration {
    @Bean("board")
    public BoardDTO getBoard() {
        System.out.println("getBoard 호출");
        return new BoardDTO(1L, "A", "B", "C");
    }
}
