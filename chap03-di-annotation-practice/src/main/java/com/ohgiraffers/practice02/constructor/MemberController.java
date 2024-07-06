package com.ohgiraffers.practice02.constructor;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller  // 스프링에게 컨트롤러 빈임을 알려주기
public class MemberController {

    @Autowired  // MemberService빈을 주입받기 위해 @Autowired 사용
    private MemberService memberService;

    public Map<Long, MemberDTO> selectMember() {
        return memberService.selectMember();
    }

    // selectMember()에 @Autowired 적용 시 에러가 발생하는 이유?:
    // 메소드 자체에 @Autowired를 사용하는 것은
    // 일반적으로 지원되지 않습니다.
    // 즉, 메소드 자체에 @Autowired를 붙여서
    // 메소드가 Spring에 의해 자동으로 호출되도록 하려는 시도는
    // 제대로 동작하지 않을 수 있습니다.
}

// 따라서 MemberController의 selectMember() 메소드에
// @Autowired 어노테이션을 직접 적용하는 것은 올바른 방법이 아닙니다. @Autowired는 필드나 Setter 메소드에만 사용해야 하며, 메소드 자체에는 적용되지 않습니다. MemberService 필드에 @Autowired를 사용하여 MemberService 빈을 주입받으면 됩니다.
// 그리고 MemberController에서 memberService 필드를 사용하여
// selectMember() 메소드에서 memberService 빈의 메소드를
// 호출할 수 있습니다.