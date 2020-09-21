package frank.service;

import frank.mapper.MemberMapper;
import frank.model.Member;
import frank.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberMapper memberMapper;

    public List<Member> query(Member member) {
        List<Member> members = memberMapper.selectByCondition(member);
        return members;
    }

    @Transactional
    public void add(Member member, HttpSession session) {
        User user = (User) session.getAttribute("user");
        member.setUserId(user.getId());//设置抽奖人员的 ID
        member.setCreateTime(new Date());//设置时间
        memberMapper.insert(member);
    }
    @Transactional
    public void update(Member member) {
        memberMapper.updateByPrimaryKeySelective(member);
    }
    @Transactional
    public void delete(Integer id) {
        memberMapper.deleteByPrimaryKey(id);
    }
}
