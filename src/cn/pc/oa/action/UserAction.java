package cn.pc.oa.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.pc.oa.dao.UserDao;
import cn.pc.oa.pojo.User;

@Controller
public class UserAction extends ActionSupport implements ModelDriven<User>{

	@Autowired
	private UserDao userDao;
	private static final long serialVersionUID = 7956078770085409173L;
	private User user = new User();
	
	public String test(){
		User pojo = userDao.getByID(1L);
		ActionContext.getContext().getSession().put("pojo", pojo);
		System.out.println(pojo.getUname());
		return "haha";
	}
	
	@Override
	public User getModel() {
		return this.user;
	}
	
}
