package cn.gov.bjtzh.smss.middle.entity.dao;

import cn.gov.bjtzh.smss.middle.entity.po.TbClientToUsr;
import cn.gov.bjtzh.smss.middle.entity.po.TbClientToUsrExample;
import tk.mybatis.mapper.common.Mapper;

public interface TbClientToUsrMapper extends Mapper<TbClientToUsr> {
    long countByExample(TbClientToUsrExample example);
}