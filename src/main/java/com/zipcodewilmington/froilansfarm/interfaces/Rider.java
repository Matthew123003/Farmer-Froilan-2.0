package com.zipcodewilmington.froilansfarm.interfaces;

public interface Rider<T extends Rideable> {
    boolean mount(T rideable);
}
