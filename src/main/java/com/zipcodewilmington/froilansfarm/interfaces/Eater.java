package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public interface Eater<T extends Edible> {
    boolean eat(T food);
}
