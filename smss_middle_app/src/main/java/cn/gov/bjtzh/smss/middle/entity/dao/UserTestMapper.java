package cn.gov.bjtzh.smss.middle.entity.dao;

import cn.gov.bjtzh.smss.middle.entity.po.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserTestMapper extends Mapper<User> {
}
