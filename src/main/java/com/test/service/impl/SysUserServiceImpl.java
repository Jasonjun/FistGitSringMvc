package com.test.service.impl;

import java.util.ArrayList;
import java.util.List;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.SysUser;
import com.test.mapper.SysUserMapper;
import com.test.service.SysUserService;
@Service
public class SysUserServiceImpl implements SysUserService {
	/*@Autowired
	private SysUserMapper sysUserMapper;*/
	public List<SysUser> getUserList() throws Exception {
		SysUser sysUser = new SysUser();
		sysUser.setId(123);
		sysUser.setUserName("Jackjoans");
		List<SysUser> list = new ArrayList<SysUser>();
		list.add(sysUser);
		return list;
		//return sysUserMapper.getUserList();
	}



 

    
}
