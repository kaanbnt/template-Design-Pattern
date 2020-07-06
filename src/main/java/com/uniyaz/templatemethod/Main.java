package com.uniyaz.templatemethod;

/**
 * Main
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class Main {
    public static void main(String[] args) {
        OrderTamplate orderTamplate = new RetailOrder();
        orderTamplate.order();
    }
}
