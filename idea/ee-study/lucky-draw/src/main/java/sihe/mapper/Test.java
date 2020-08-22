package sihe.mapper;

import org.apache.ibatis.annotations.Mapper;
import sihe.model.User;
@Mapper
public interface Test {

    User query(Integer id);
}
