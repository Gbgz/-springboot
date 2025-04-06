package com.ltf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ltf.entity.ProductSwiperImage;
import com.ltf.mapper.ProductSwiperImageMapper;
import com.ltf.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 产品轮播图片Service实现类
 *
 */
@Service("productSwiperImageService")
public class IProductSwiperImageServiceImpl extends ServiceImpl<ProductSwiperImageMapper,ProductSwiperImage> implements IProductSwiperImageService {

    @Autowired
    private ProductSwiperImageMapper productSwiperImageMapper;
}
