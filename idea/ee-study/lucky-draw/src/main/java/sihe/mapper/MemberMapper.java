package sihe.mapper;

import org.apache.ibatis.annotations.Mapper;
import sihe.base.BaseMapper;
import sihe.model.Member;

@Mapper
public interface MemberMapper extends BaseMapper<Member> {
}