package com.heiha.sinfonia.wechat.repository;

import com.heiha.sinfonia.wechat.mapper.WechatMsgMapper;
import com.heiha.sinfonia.wechat.po.WechatMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * <br>
 * <b>Project:</b> wechat<br>
 * <b>Date:</b> 2017/8/17 19:27<br>
 * <b>Author:</b> heiha<br>
 */
@Repository
public class WechatMsgRepositroy {
    @Autowired
    private WechatMsgMapper wechatMsgMapper;

    public void save(WechatMsg wechatMsg) {
        wechatMsgMapper.insert(wechatMsg);
    }
}
