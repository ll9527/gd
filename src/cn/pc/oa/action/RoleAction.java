package cn.pc.oa.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.pc.oa.pojo.Role;
import cn.pc.oa.service.RoleService;

@Controller
@Scope("prototype")
public class RoleAction extends ActionSupport implements ModelDriven<Role>{
	
	@Autowired
	private RoleService rs;
	private Role role = new Role();
	
	@Override
	public Role getModel() {
		return this.role;
	}
	/**
	 * 跳转addUI页面
	 * @return
	 */
	public String addUI(){
		ActionContext.getContext().getSession().put("role", null);
		return "addUI";
	}
	/**
	 * 增加岗位
	 */
	public String add() {
		rs.add(role);
		return "tolist";
	}
	/**
	 * 返回list页面
	 * @return
	 */
	public String findAll(){
		List<Role> list = rs.findAll();
		ActionContext.getContext().getSession().put("list", list);
		return "list";
	}
	/**
	 * 删除
	 * @return
	 */
	public String delOne(){
		rs.delOne(role);
		return "tolist";
	}
	
	public String edit() {
		ActionContext.getContext().getSession().put("role", role);
		return "addUI";
	}
}
