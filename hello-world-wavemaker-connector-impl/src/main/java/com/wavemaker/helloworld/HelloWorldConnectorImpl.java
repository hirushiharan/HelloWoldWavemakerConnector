package com.wavemaker.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import com.wavemaker.helloworld.HelloWorldConnector;

@Service
@Primary
public class HelloWorldConnectorImpl implements HelloWorldConnector{

    private static final Logger logger = LoggerFactory.getLogger(HelloWorldConnectorImpl.class);

    @Override
    public String helloConnector(){
        return "Hey, this is Hello World connector";
    }
}