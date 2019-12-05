package com.springboot.demo.qualifier;

import org.springframework.stereotype.Component;

/**
 * 饼干
 */
@Component("cookies")
public class Cookies implements Dessert {
    @Override
    public void look() {
        System.out.println("饼干看起来很香的鸭子");
    }
}
