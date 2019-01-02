package com.test.mapper;


import java.util.List;

import com.test.entity.SysUser;


public interface SysUserMapper {
    public List<SysUser> getUserList() throws Exception;
}
