package sihe.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import sihe.base.BaseMapper;
import sihe.model.Setting;

@Mapper
public interface SettingMapper extends BaseMapper<Setting> {

    //mybatis传入参数有多个的时候,需要使用@Param并指定名称,xml中引用@Param
    int updateByUserId(@Param("userId")Integer id,@Param("batchNumber") Integer batchNumber);

}