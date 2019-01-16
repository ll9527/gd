package cn.pc.oa.service;

import java.util.List;

import cn.pc.oa.pojo.Role;

public interface RoleService {
	/**
	 * 增加岗位
	 * @param r
	 */
	public void add(Role r);
	/**
	 * 查找全部
	 * @return
	 */
	public List<Role> findAll();
	/**
	 * 删除一条岗位
	 * @param r
	 */
	public void delOne(Role r);
}
