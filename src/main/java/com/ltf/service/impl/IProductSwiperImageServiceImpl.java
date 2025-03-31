package com.ltf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ltf.entity.ProductSwiperImage;
import com.ltf.mapper.ProductSwiperImageMapper;
import com.ltf.service.IProductSwiperImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 产品轮播图片Service实现类
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-23 22:02
 */
@Service("productSwiperImageService")
public class IProductSwiperImageServiceImpl extends ServiceImpl<ProductSwiperImageMapper,ProductSwiperImage> implements IProductSwiperImageService {

    @Autowired
    private ProductSwiperImageMapper productSwiperImageMapper;
}
