package cn.pc.oa.dao;

import java.util.List;

import cn.pc.oa.pojo.Role;

public interface RoleDao {
	/**
	 * dao增加岗位
	 * @param r
	 */
	public void add(Role r);
	/**
	 * 用id查找一条数据
	 * @param id
	 * @return
	 */
	public Role findById(Long id);
	/**
	 * dao查找全部
	 */
	public List<Role> findAll();
	/**
	 * 删除一条岗位记录
	 * @param r
	 */
	public void del(Role r);
}
