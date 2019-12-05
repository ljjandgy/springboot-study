package com.springboot.demo.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class QualifierTest {
    @Autowired
    @Qualifier("cookies")
    private Dessert dessert;
    @Test
    public void test(){
        dessert.look();
    }
}
