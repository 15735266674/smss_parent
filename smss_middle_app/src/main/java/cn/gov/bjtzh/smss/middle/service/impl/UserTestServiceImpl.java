package cn.gov.bjtzh.smss.middle.service.impl;

import cn.gov.bjtzh.smss.middle.entity.dao.UserTestMapper;
import cn.gov.bjtzh.smss.middle.entity.po.User;
import cn.gov.bjtzh.smss.middle.service.UserTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserTestServiceImpl implements UserTestService {

    @Autowired
    private UserTestMapper userTestMapper;
    @Override
    public List<User> getUserList() {
        List<User> users = userTestMapper.selectAll();
        return users;
    }

    @Override
    public boolean addUser(User user) {
        userTestMapper.insert(user);
        return true;
    }

    @Override
    public boolean removeById(String id) {


        User user = new User();
        user.setId(Long.parseLong(id));

        //  userTestMapper.deleteByExample(id);
        //userTestMapper.deleteByExample();
        //userTestMapper.deleteByExample();
        userTestMapper.delete(user);
        return true;
    }
}
