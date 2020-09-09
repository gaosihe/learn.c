package sihe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sihe.mapper.MemberMapper;
import sihe.model.Member;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    private MemberMapper memberMapper;


    public List<Member> query(Member member) {

        return memberMapper.selectByCondition(member);
    }
}
