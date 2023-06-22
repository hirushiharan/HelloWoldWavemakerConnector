package com.wavemaker.helloworld;

import com.wavemaker.runtime.connector.annotation.WMConnector;


@WMConnector(name = "HelloWorldConnector",
        description = "Custom hello world Wavemaker connector")
public interface HelloWorldConnector {

    public String helloConnector();

}