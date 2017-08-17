package com.heiha.sinfonia.wechat.api;

import com.heiha.sinfonia.wechat.po.WechatMsg;
import com.heiha.sinfonia.wechat.service.WechatMsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * <br>
 * <b>Project:</b> wechat<br>
 * <b>Date:</b> 2017/8/17 17:38<br>
 * <b>Author:</b> heiha<br>
 */
@RestController
@RequestMapping("/v1/msg")
public class MessageController {
    @Autowired
    private WechatMsgService wechatMsgService;

    @RequestMapping(method = RequestMethod.POST)
    public void save(@RequestBody WechatMsg wechatMsg) {
        wechatMsgService.save(wechatMsg);
    }
}
