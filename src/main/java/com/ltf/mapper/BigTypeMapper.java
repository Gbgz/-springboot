package com.ltf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ltf.entity.BigType;

/**
 * 商品大类Mapper接口
 */

public interface BigTypeMapper extends BaseMapper<BigType> {
    public BigType findById(Integer id);
}
