package cn.gov.bjtzh.smss.middle.service;

import cn.gov.bjtzh.smss.middle.entity.po.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserTestService {
    List<User> getUserList();

    boolean addUser(User user);

    boolean removeById(String id);
}
