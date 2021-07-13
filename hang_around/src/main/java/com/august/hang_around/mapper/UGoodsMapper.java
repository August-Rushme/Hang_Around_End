package com.august.hang_around.mapper;

import com.august.hang_around.domain.UGoods;
import com.august.hang_around.domain.UGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UGoodsMapper {
    long countByExample(UGoodsExample example);

    int deleteByExample(UGoodsExample example);

    int deleteByPrimaryKey(Long gid);

    int insert(UGoods record);

    int insertSelective(UGoods record);

    List<UGoods> selectByExampleWithBLOBs(UGoodsExample example);

    List<UGoods> selectByExample(UGoodsExample example);

    UGoods selectByPrimaryKey(Long gid);

    int updateByExampleSelective(@Param("record") UGoods record, @Param("example") UGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") UGoods record, @Param("example") UGoodsExample example);

    int updateByExample(@Param("record") UGoods record, @Param("example") UGoodsExample example);

    int updateByPrimaryKeySelective(UGoods record);

    int updateByPrimaryKeyWithBLOBs(UGoods record);

    int updateByPrimaryKey(UGoods record);
}