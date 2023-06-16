package com.softwaremill.demospringbootdockercompose;

import com.softwaremill.demospringbootdockercompose.config.TestContainersConfiguration;
import org.springframework.boot.SpringApplication;

public final class TestApplication
{
    public static void main(final String[] aArgs)
    {
	SpringApplication.from(Application::main)
			 .with(TestContainersConfiguration.class)
			 .run(aArgs);
    }
}
