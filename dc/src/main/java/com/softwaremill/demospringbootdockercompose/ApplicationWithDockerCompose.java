package com.softwaremill.demospringbootdockercompose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationWithDockerCompose
{
    public static void main(final String[] aArgs)
    {
	SpringApplication.run(ApplicationWithDockerCompose.class, aArgs);
    }
}
