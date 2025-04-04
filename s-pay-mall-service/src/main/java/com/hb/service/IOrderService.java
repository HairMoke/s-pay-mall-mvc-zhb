package com.hb.service;

import com.hb.domain.req.ShopCartReq;
import com.hb.domain.res.PayOrderRes;

/**
 * 订单服务接口
 */
public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

}
