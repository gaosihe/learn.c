package sihe.base;

import java.util.List;

public interface BaseMapper<T extends BaseEntity> {
    T selectByPrimaryKey (Integer id);//查询单个奖品

    int deleteByPrimaryKey(Integer id);//删除指定奖品

    List<T> selectAll();

    List<T> selectByCondition(T t);

    int insert(T record);

    int insertSelective(T record);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    T selectOne(T record);

    int deleteByIds(List<Integer> ids);
}
