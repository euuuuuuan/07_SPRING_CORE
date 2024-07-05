package com.ohgiraffers.practice02.javaconfig;

import com.ohgiraffers.common.BoardDTO;
import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;

public class ContextConfiguration {

    @Bean("board")
    public BoardDTO boardGenerator() {
        BoardDTO boardDTO = new BoardDTO();
        boardDTO.setId(1L);
        boardDTO.setTitle("이길산");
        boardDTO.setContent("아리랑이 도로로로롱!");
        boardDTO.setWriter(memberGenerator());
        return boardDTO;
    }

    @Bean("member")
    public MemberDTO memberGenerator() {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(3L);
        memberDTO.setNickname("킹갓짱");
        return memberDTO;
    }


}
