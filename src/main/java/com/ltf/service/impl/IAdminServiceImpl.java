package com.ltf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ltf.entity.Admin;
import com.ltf.mapper.AdminMapper;
import com.ltf.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员Service实现类
 * @author ltf_小锋
 * @site www.ltf.com
 * @company 南通小锋网络科技有限公司
 * @create 2022-02-23 22:02
 */
@Service("adminService")
public class IAdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;
}
