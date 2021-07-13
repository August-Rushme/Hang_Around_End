package com.august.hang_around.mapper;

import com.august.hang_around.domain.GoodsCollection;
import com.august.hang_around.domain.GoodsCollectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsCollectionMapper {
    long countByExample(GoodsCollectionExample example);

    int deleteByExample(GoodsCollectionExample example);

    int deleteByPrimaryKey(String id);

    int insert(GoodsCollection record);

    int insertSelective(GoodsCollection record);

    List<GoodsCollection> selectByExampleWithBLOBs(GoodsCollectionExample example);

    List<GoodsCollection> selectByExample(GoodsCollectionExample example);

    GoodsCollection selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") GoodsCollection record, @Param("example") GoodsCollectionExample example);

    int updateByExampleWithBLOBs(@Param("record") GoodsCollection record, @Param("example") GoodsCollectionExample example);

    int updateByExample(@Param("record") GoodsCollection record, @Param("example") GoodsCollectionExample example);

    int updateByPrimaryKeySelective(GoodsCollection record);

    int updateByPrimaryKeyWithBLOBs(GoodsCollection record);

    int updateByPrimaryKey(GoodsCollection record);
}