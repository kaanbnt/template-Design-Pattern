package com.uniyaz.templatemethod;

/**
 * RetailOrder
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
public class RetailOrder extends OrderTamplate {
    @Override
    public void doSelect() {
        System.out.println("Seçtiğiniz ürün sepetinize eklendi..");
    }

    @Override
    public void payment() {
        System.out.println("Ödemenizi Kart İle Yapınız");
    }
}
