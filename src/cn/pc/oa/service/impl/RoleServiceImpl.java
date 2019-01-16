package cn.pc.oa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.pc.oa.dao.RoleDao;
import cn.pc.oa.pojo.Role;
import cn.pc.oa.service.RoleService;

@Transactional
@Service
public class RoleServiceImpl implements RoleService {
	@Autowired
	private RoleDao rd;

	@Override
	public void add(Role r) {
		rd.add(r);
	}

	@Override
	public List<Role> findAll() {
		return rd.findAll();
	}

	@Override
	public void delOne(Role r) {
		rd.del(r);
	}

	
}
