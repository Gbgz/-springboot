package com.ltf.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ltf.entity.Order;

import java.util.List;
import java.util.Map;

/**
 * 订单Service接口
 * @author ltf_小锋
 * @site www.ltf.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-23 22:01
 */
public interface IOrderService extends IService<Order> {

    /**
     * 根据条件分页查询订单数据
     * @param map
     * @return
     */
    List<Order> list(Map<String,Object> map);

    /**
     * 根据条件查询订单总记录数
     * @param map
     * @return
     */
    Long getTotal(Map<String,Object> map);
}
