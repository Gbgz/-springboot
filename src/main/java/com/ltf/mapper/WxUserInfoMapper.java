package com.ltf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ltf.entity.BigType;
import com.ltf.entity.WxUserInfo;
import com.ltf.entity.WxUserInfo;

/**
 * 微信用户Mapper接口
 * @author ltf_小锋
 * @site www.ltf.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-23 22:00
 */
public interface WxUserInfoMapper extends BaseMapper<WxUserInfo> {

    public WxUserInfo findByOpenId(String openId);
}
