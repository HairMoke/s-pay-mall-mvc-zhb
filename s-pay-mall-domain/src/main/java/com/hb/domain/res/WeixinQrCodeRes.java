package com.hb.domain.res;


import lombok.Data;


/**
 * 获取微信登录二维码响应对象
 */
@Data
public class WeixinQrCodeRes {

    private String ticket;
    private Long expire_seconds;
    private String url;

}
