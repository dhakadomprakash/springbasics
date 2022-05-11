package com.nt.test;

import com.nt.beans.Flipkart;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dhakado on 5/11/2022
 */
public class StereoTypeAnnotationTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Flipkart fKart = context.getBean("fKart", Flipkart.class);
        fKart.shopping(new String[]{"t-shirt", "shirt", "jeans"}, new double[]{699.0, 599.0, 2999.0});
        context.close();
    }
}
