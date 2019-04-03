package cn.yq.ssm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.yq.ssm.pojo.User;

public interface UserService {
	User selectByPrimaryKey(Integer id);
	
	List<User> selectByCondition();
	
	int updateByPrimaryKey(User user);
	
	int deleteByPrimarykey(Integer id);
	
	int insert(User user);
}
