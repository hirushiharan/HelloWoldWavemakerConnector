package com.wavemaker.helloworld;

import com.wavemaker.runtime.connector.annotation.WMConnector;


@WMConnector(name = "HelloWorldConnector",
        description = "Custom hello world Wavemaker connector")
public interface HelloWorldConnector {

    default String helloConnector(){
        return "Hello World !";
    }

}