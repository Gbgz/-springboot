package com.ltf.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ltf.entity.Order;
import com.ltf.mapper.OrderMapper;
import com.ltf.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 订单Service实现类
 * @author ltf_小锋
 * @site www.ltf.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-23 22:02
 */
@Service("orderService")
public class IOrderServiceImpl extends ServiceImpl<OrderMapper,Order> implements IOrderService {

    @Autowired
    private OrderMapper orderMapper;

    @Override
    public List<Order> list(Map<String, Object> map) {
        return orderMapper.list(map);
    }

    @Override
    public Long getTotal(Map<String, Object> map) {
        return orderMapper.getTotal(map);
    }
}
