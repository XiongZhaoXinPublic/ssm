package cn.yq.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.yq.ssm.mapper.UserMapper;
import cn.yq.ssm.pojo.User;
import cn.yq.ssm.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User selectByPrimaryKey(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> selectByCondition() {
		// TODO Auto-generated method stub
		return userMapper.selectByCondition();
	}

	@Override
	public int updateByPrimaryKey(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int deleteByPrimarykey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int insert(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

}
