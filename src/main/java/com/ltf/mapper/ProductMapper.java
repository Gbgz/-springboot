package com.ltf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ltf.entity.Product;

import java.util.List;
import java.util.Map;

/**
 * 商品Mapper接口
 */
public interface ProductMapper extends BaseMapper<Product> {
    List<Product> list(Map<String,Object> map);

    Long getTotal(Map<String,Object> map);


    void add(Product product);

    void update(Product product);

    public Product findById(Integer id);
}
