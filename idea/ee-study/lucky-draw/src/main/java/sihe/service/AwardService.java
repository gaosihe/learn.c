package sihe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sihe.mapper.AwardMapper;
import sihe.model.Award;

import java.util.List;

@Service
public class AwardService {
    @Autowired
    private AwardMapper awardMapper;

    public List<Award> query(Award award) {
        return awardMapper.query(award);
    }

    //1.session获取user,通过userid查询setting id
    //2/登陆时,session信息设置到会话
    @Transactional
    public void add(Award award) {
        awardMapper.insertSelective(award);
    }
    @Transactional
    public void update(Award award) {
        awardMapper.updateByPrimaryKeySelective(award);
    }

    @Transactional
    public void delete(Integer id) {
        awardMapper.deleteByPrimaryKey(id);
    }
}
