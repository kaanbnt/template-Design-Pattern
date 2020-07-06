package com.uniyaz.templatemethod;

/**
 * OrderTamplate
 *
 * @author Kaan BİNAT
 * @since 5.230.0
 */
abstract class OrderTamplate {

    public final void order(){
        doSelect();
        payment();
    }


    public abstract void doSelect();

    public abstract void payment();
}
