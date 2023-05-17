package jp.co.fullness.mybatis.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import jp.co.fullness.mybatis.entity.Item;

@Mapper
public interface ItemRepository {
    List<Item> selectAll();
    Item selectById(@Param("id") Integer id);
}
