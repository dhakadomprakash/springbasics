package com.nt.beans;

import org.springframework.stereotype.Component;

/**
 * @author dhakado on 5/11/2022
 */
@Component("fFlight")
public class FirstFlight implements Courier {
    public FirstFlight() {
        System.out.println("FirstFlight.FirstFlight");
    }

    @Override
    public String deliver(int orderId) {
        return "Your courier for order " + orderId + " is assigned to FirstFlight.";
    }
}
