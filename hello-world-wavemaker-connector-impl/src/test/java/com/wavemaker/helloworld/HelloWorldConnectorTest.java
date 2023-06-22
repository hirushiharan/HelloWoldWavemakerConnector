package com.wavemaker.helloworld;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import com.wavemaker.helloworld.HelloWorldConnector;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConnectorTestConfiguration.class)
public class HelloWorldConnectorTest {

    @Autowired
    private HelloWorldConnector connectorInstance;

    @Test
    public void helloConnector(){
        Assert.assertEquals("Hey, this is Hello World connector", connectorInstance.helloConnector());
    }
}