package com.infuq.dubbo.spi;

import com.alibaba.dubbo.common.URL;

public class DELLComputer implements Computer {


    @Override
    public String getName(URL url) {
        return "DELL Computer";
    }


}
