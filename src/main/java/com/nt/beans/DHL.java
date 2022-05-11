package com.nt.beans;

import org.springframework.stereotype.Component;

/**
 * @author dhakado on 5/11/2022
 */
@Component("dhl")
public class DHL implements Courier {
    public DHL() {
        System.out.println("DHL.DHL");
    }

    @Override
    public String deliver(int orderId) {
        return "Your courier for order " + orderId + " is assigned to DHL.";
    }
}
