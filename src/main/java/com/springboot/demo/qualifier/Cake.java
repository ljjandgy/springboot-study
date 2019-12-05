package com.springboot.demo.qualifier;

import org.springframework.stereotype.Component;

/**
 * 蛋糕
 */
@Component("cake")
public class Cake implements Dessert{
    @Override
    public void look() {
        System.out.println("蛋糕看起来很漂亮");
    }
}
