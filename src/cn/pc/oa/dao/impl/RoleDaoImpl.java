package cn.pc.oa.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import cn.pc.oa.dao.RoleDao;
import cn.pc.oa.pojo.Role;

@Repository
public class RoleDaoImpl extends HibernateDaoSupport implements RoleDao {
	
	@Autowired 
    public void setMySessionFactory(SessionFactory sessionFactory){  
        super.setSessionFactory(sessionFactory);  
    }  
	
	@Override
	public void add(Role r) {
		getHibernateTemplate().saveOrUpdate(r);
	}

	@Override
	public List<Role> findAll() {
		String sql = "from Role";
		List<Role> list = getHibernateTemplate().find(sql);
		return list;
	}

	@Override
	public void del(Role r) {
		getHibernateTemplate().delete(findById(r.getRid()));
	}

	@Override
	public Role findById(Long id) {
		String hql = "from Role where rid=" + id;
		Role r= (Role) getHibernateTemplate().find(hql).get(0);
		return r;
	}

}
