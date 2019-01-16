package cn.pc.oa.dao.impl;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.pc.oa.dao.UserDao;
import cn.pc.oa.pojo.User;

@Transactional
@Repository
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	@Autowired 
    public void setMySessionFactory(SessionFactory sessionFactory){  
        super.setSessionFactory(sessionFactory);  
    }  
	
	@Override
	public User getByID(Long id) {
		User user = getHibernateTemplate().get(User.class, id);
		return user;
	}

}
