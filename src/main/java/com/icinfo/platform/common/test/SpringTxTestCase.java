package com.icinfo.platform.common.test;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 测试类集成
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = {"classpath:entry/spring-entry.xml"}
)
public class SpringTxTestCase {
    public SpringTxTestCase() {
    }
}
