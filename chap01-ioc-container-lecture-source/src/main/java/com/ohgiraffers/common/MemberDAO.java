package com.ohgiraffers.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/*
 * @Component
 * - 처음 IOC 컨테이너가 동작할 때 해당 어노테이션이 붙은 클래스들을 찾아서
 * - 빈으로 등록하고, 알아서 객체로 만들어준다.
 * */

@Component
public class MemberDAO {
    private final Map<Integer, MemberDTO> memberMap;  // 일반적 상수가 아니라 의존성 주입을 하는 경우 대문자가 아닌 카멜 케이스 사용

    // 의존성 주입
    public MemberDAO() {
        memberMap = new HashMap<Integer, MemberDTO>();

        memberMap.put(1, new MemberDTO(1, "user01", "pass01", "홍길동"));
        memberMap.put(2, new MemberDTO(2, "user02", "pass02", "유관순"));
    }

    // 매개변수로 전달받은 회원정보를 Map에서 조회 후 회원정보를 리턴하는 메소드
    public MemberDTO selectMember(int sequence) {
        return memberMap.get(sequence);
    }

    // 매개변수를 전달받은 회원정보를 Map에 추가하고 성공 여부를 boolean으로 리턴하는 메소드
    public boolean insertMember(MemberDTO newMember) {
        int before = memberMap.size();
        memberMap.put(newMember.getSequence(), newMember);
        int after = memberMap.size();
        return after > before ? true : false;
    }
}
