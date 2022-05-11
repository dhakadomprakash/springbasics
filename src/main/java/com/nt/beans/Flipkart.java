package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

/**
 * @author dhakado on 5/11/2022
 */
@Component("fKart")
public final class Flipkart {

    @Autowired
    @Qualifier("dPartner")
    private Courier courier;

    public Flipkart() {
        System.out.println("Flipkart.Flipkart");
    }

    public void shopping(String[] items, double[] prices) {
        double billAmount = 0;

        for (double price : prices) {
            billAmount += price;
        }

        int orderId = new Random().nextInt(100000);
        String deliverMsg = courier.deliver(orderId);

        System.out.println(Arrays.asList(items) + "have ordered, Please pay billAmount " + billAmount + " " + deliverMsg);


    }
}
