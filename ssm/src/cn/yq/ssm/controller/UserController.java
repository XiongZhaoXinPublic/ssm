package cn.yq.ssm.controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.yq.ssm.pojo.User;
import cn.yq.ssm.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService service;
	@RequestMapping("/list.do")
	public String userList(Model m) {
		System.out.println("进来了");
		// 查询所有用户
		List<User> users = service.selectByCondition();
		// 共享数据
		m.addAttribute("users", users);

		return "/WEB-INF/view/userList.jsp";
	}
	/*@RequestMapping("/userListByAjax.do")
	public void userListByAjax(HttpServletResponse resp) throws IOException {

		//查询所有的用户
		List<User> users = service.selectByCondition();

		//转换成json字符串
		String usersJson = JSON.toJSONString(users);
		
		resp.setContentType("application/json;charset=utf-8");
		
		resp.getWriter().print(usersJson);

	}*/
	
	
	@RequestMapping("/userEdit.do")
	public String userEdit(Integer id,Model m) {
		
		if(id!=null) {
			User user = service.selectByPrimaryKey(id);
			//共享user对象
			m.addAttribute("user",user);
		}
		

		return "/WEB-INF/view/userEdit.jsp";
	}
	
	
	@RequestMapping("/userSaveOrUpdate.do")
	public String userSaveOrUpdate(User user) {
		
		System.out.println(user);
		
		if(user.getId() ==null) {
			//执行插入操作
			service.insert(user);
		}else {
			//执行修改操作
			service.updateByPrimaryKey(user);
		}
		return "redirect:/user/userList.do";
	}

}




