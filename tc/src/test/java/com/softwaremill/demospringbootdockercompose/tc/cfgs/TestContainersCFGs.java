package com.softwaremill.demospringbootdockercompose.tc.cfgs;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.MongoDBContainer;

@TestConfiguration(proxyBeanMethods = false)
public class TestContainersCFGs
{
    @Bean
    @ServiceConnection
    public MongoDBContainer mongoDBContainer()
    {
	return new MongoDBContainer("mongo:6.0.5");
    }
}
