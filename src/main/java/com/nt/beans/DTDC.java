package com.nt.beans;

import org.springframework.stereotype.Component;

/**
 * @author dhakado on 5/11/2022
 */

@Component("dtdc")
public class DTDC implements Courier {
    public DTDC() {
        System.out.println("DTDC.DTDC");
    }

    @Override
    public String deliver(int orderId) {
        return "Your courier for order " + orderId + " is assigned to DTDC.";
    }
}
