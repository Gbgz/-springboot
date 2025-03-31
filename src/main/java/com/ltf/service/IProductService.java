package com.ltf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ltf.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 商品Service接口
 * @author java1234_小锋
 * @site www.java1234.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-23 22:01
 */

public interface IProductService extends IService<Product> {
    List<Product> list(Map<String,Object> map);
    Long getTotal(Map<String,Object> map);

    void add(Product product);

    void update(Product product);

    Product findById(Integer id);
}
