package com.infuq.provider;

import com.infuq.facade.UserFacade;

public class UserFacadeImpl implements UserFacade {


    @Override
    public Object update(String address) {

        System.out.println("[Dubbo提供者]:" + Thread.currentThread().getName() + "执行Dubbo接口调用");

        System.out.println("接收入参: " + address);

        return "invoke success...";
    }


}
