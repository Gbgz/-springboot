package com.ltf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ltf.entity.Admin;
import com.ltf.mapper.AdminMapper;
import com.ltf.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 管理员Service实现类
 */
@Service("adminService")
public class IAdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;
}
