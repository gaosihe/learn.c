package sihe.mapper;

import org.apache.ibatis.annotations.Mapper;
import sihe.base.BaseMapper;
import sihe.model.Award;

import java.util.List;

@Mapper
public interface AwardMapper extends BaseMapper<Award> {

    List<Award> query(Award award);
}