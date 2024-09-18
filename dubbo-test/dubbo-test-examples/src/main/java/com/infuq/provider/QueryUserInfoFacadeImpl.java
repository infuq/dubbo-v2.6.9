package com.infuq.provider;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class QueryUserInfoFacadeImpl implements QueryUserInfoFacade {


    @Override
    public Object update(String address) {

        System.out.println("[Dubbo提供者]:" + Thread.currentThread().getName() + "执行Dubbo接口调用");

        System.out.println("接收入参: " + address);

        return "invoke success...";
    }


}
