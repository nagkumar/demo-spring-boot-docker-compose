package com.softwaremill.demospringbootdockercompose.tests;

import com.softwaremill.demospringbootdockercompose.Application;
import com.softwaremill.demospringbootdockercompose.tc.cfgs.TestContainersCFGs;
import org.springframework.boot.SpringApplication;

public final class TestApplication
{
    public static void main(final String[] aArgs)
    {
	SpringApplication.from(Application::main)
			 .with(TestContainersCFGs.class)
			 .run(aArgs);
    }
}
