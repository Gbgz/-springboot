package com.ltf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ltf.entity.BigType;
import com.ltf.mapper.BigTypeMapper;
import com.ltf.service.IBigTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 商品大类Service实现类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-23 22:02
 */
@Service("bigTypeService")
public class IBigTypeServiceImpl extends ServiceImpl<BigTypeMapper,BigType> implements IBigTypeService {

    @Autowired
    private BigTypeMapper bigTypeMapper;
}
