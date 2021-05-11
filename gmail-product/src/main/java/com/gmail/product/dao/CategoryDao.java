package com.gmail.product.dao;

import com.gmail.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wux
 * @email 2226541055@qq.com
 * @date 2021-05-09 22:13:50
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
