package com.hb.service;

import com.hb.domain.req.ShopCartReq;
import com.hb.domain.res.PayOrderRes;

import java.util.List;

/**
 * 订单服务接口
 */
public interface IOrderService {

    PayOrderRes createOrder(ShopCartReq shopCartReq) throws Exception;

    void changeOrderPaySuccess(String orderId);

    List<String> queryNoPayNotifyOrder();

    List<String> queryTimeoutCloseOrderList();

    boolean changeOrderClose(String orderId);


}
