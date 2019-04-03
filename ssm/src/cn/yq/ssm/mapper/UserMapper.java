package cn.yq.ssm.mapper;

import java.util.List;

import cn.yq.ssm.pojo.User;

public interface UserMapper {
		
	User selectByPrimaryKey(Integer id);
	
	List<User> selectByCondition();
	
	int updateByPrimaryKey(User user);
	
	int deleteByPrimarykey(Integer id);
	
	int insert(User user);

	
}
