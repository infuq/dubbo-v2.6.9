package com.infuq.dubbo.spi;

import com.alibaba.dubbo.common.extension.ExtensionLoader;

public class Main {


    public static void main(String[] args) {


        ExtensionLoader<Computer> extensionLoader = ExtensionLoader.getExtensionLoader(Computer.class);

        Computer dell = extensionLoader.getExtension("hp1");
//        System.out.println(dell.getName());

        Computer adaptiveExtension = extensionLoader.getAdaptiveExtension();

//        System.out.println(adaptiveExtension.getName());

    }




}
