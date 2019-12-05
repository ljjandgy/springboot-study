package com.springboot.demo.qualifier;

import org.springframework.stereotype.Component;

/**
 * 雪糕
 */
@Component("iceCream")
public class IceCream implements Dessert {
    @Override
    public void look() {

    }
}
