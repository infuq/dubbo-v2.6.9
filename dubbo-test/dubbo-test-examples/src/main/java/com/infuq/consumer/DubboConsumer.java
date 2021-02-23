package com.infuq.consumer;

import com.infuq.provider.QueryUserInfoFacade;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class DubboConsumer {

    public static void main(String[] args) throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("DubboConsumer.xml");

        QueryUserInfoFacade queryUserInfoFacade = context.getBean(QueryUserInfoFacade.class);
        Object ret = queryUserInfoFacade.update("hangzhou");
        System.out.println("Dubbo接口调用返回值:" + ret);

        System.in.read();

    }
}
