package com.infuq.dubbo.spi;

import com.alibaba.dubbo.common.URL;

public class HPWrapperComputer implements Computer {

    private Computer computer;

    public HPWrapperComputer(Computer computer) {
        this.computer = computer;
    }


    @Override
    public String getName(URL url) {
        System.out.println("before...");
        return computer.getName(url);
    }
}
