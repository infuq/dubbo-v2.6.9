package com.infuq.dubbo.spi;


import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.Adaptive;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public interface Computer {

    @Adaptive
    String getName(URL url);

}
