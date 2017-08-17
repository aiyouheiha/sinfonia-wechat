package com.heiha.sinfonia.wechat.mapper;

import com.heiha.sinfonia.wechat.po.WechatMsg;
import com.heiha.sinfonia.wechat.po.WechatMsgExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface WechatMsgMapper {
    long countByExample(WechatMsgExample example);

    int deleteByExample(WechatMsgExample example);

    int deleteByPrimaryKey(Long id);

    int insert(WechatMsg record);

    int insertSelective(WechatMsg record);

    List<WechatMsg> selectByExample(WechatMsgExample example);

    WechatMsg selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") WechatMsg record, @Param("example") WechatMsgExample example);

    int updateByExample(@Param("record") WechatMsg record, @Param("example") WechatMsgExample example);

    int updateByPrimaryKeySelective(WechatMsg record);

    int updateByPrimaryKey(WechatMsg record);
}