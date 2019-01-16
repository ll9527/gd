package cn.pc.oa.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.pc.oa.pojo.Role;
import cn.pc.oa.service.RoleService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:app*.xml")
public class test {
	@Autowired
	private RoleService rs;
	
	@Test
	public void test(){
		List<Role> list = rs.findAll();
		System.out.println(list);
	}
}
