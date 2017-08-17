package com.heiha.sinfonia.wechat.service;

import com.heiha.sinfonia.wechat.po.WechatMsg;
import com.heiha.sinfonia.wechat.repository.WechatMsgRepositroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <br>
 * <b>Project:</b> wechat<br>
 * <b>Date:</b> 2017/8/17 19:30<br>
 * <b>Author:</b> heiha<br>
 */
@Service
public class WechatMsgService {
    @Autowired
    private WechatMsgRepositroy wechatMsgRepositroy;

    public void save(WechatMsg wechatMsg) {
        wechatMsgRepositroy.save(wechatMsg);
    }
}
