package com.ltf.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ltf.entity.BigType;
import com.ltf.entity.WxUserInfo;
import com.ltf.entity.WxUserInfo;

/**
 * 微信用户Mapper接口
 */
public interface WxUserInfoMapper extends BaseMapper<WxUserInfo> {

    public WxUserInfo findByOpenId(String openId);
}
