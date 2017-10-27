package com.alibaba.rocketmq.config;

import com.alibaba.rocketmq.common.MixAll;

/**
 * 把需要补充的初始化环境变量正式的放入系统属性中
 * 
 * @author yankai913@gmail.com
 * @date 2014-2-10
 * 
 */
public class ConfigureInitializer {

    public static final String SHOW_MSG_BODY = "show.msg.body";

    private String             namesrvAddr;

    private String             showMsgBody;

    public String getNamesrvAddr() {
        return namesrvAddr;
    }

    public void setNamesrvAddr(String namesrvAddr) {
        this.namesrvAddr = namesrvAddr;
    }

    public String getShowMsgBody() {
        return showMsgBody;
    }

    public void setShowMsgBody(String showMsgBody) {
        this.showMsgBody = showMsgBody;
    }

    public void init() {
        System.setProperty(MixAll.NAMESRV_ADDR_PROPERTY, namesrvAddr);
        System.setProperty(ConfigureInitializer.SHOW_MSG_BODY, showMsgBody);
    }
}
