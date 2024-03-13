package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     * @param flavors
     */
    void insertBatch(List<DishFlavor> flavors);

    @Delete("delete from sky_take_out.dish_flavor where sky_take_out.dish_flavor.id = #{id}")
    void deleteByDishIds(Long id);

    @Select("select *from sky_take_out.dish_flavor where dish_id = #{id}")
    List<DishFlavor> getByDishId(Long id);
}