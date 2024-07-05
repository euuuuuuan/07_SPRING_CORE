package com.ohgiraffers.practice01.field;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("memberServiceField")
public class MemberService {

    private final MemberDAO memberDAO;

    @Autowired
    public MemberService(MemberDAO memberDAO) {
        this.memberDAO = memberDAO;
    }

    public Map<Long, MemberDTO> selectMember() {
        return memberDAO.selectMember();
    }

}