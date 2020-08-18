package sihe.mapper;

import org.apache.ibatis.annotations.Mapper;
import sihe.base.BaseMapper;
import sihe.model.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}