package com.softwaremill.demospringbootdockercompose.tests;

import com.softwaremill.demospringbootdockercompose.tc.cfgs.TestContainersCFGs;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
@Import(TestContainersCFGs.class)
class ApplicationTest
{
    @Test
    void contextLoads()
    {

    }
}
