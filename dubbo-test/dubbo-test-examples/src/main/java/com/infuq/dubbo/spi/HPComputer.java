package com.infuq.dubbo.spi;


import com.alibaba.dubbo.common.Extension;
import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Activate;
import com.alibaba.dubbo.common.extension.Adaptive;



//@Adaptive
public class HPComputer implements Computer {


    @Override
    public String getName(URL url) {
        return "HP Computer";
    }


}
