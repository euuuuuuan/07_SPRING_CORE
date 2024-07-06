package com.ohgiraffers.practice02.constructor;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberServiceField")  // 스프링에게 서비스 빈임을 알려주기.
public class MemberService {

    @Autowired
    private MemberDAO memberDAO;

    public Map<Long, MemberDTO> selectMember() {
        return memberDAO.selectMember();
    }

}