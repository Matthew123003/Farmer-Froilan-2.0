package com.zipcodewilmington.froilansfarm.livingthings;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public abstract class Person implements Eater {
    @Override
    public boolean eat(Edible food) {
        return food != null;
    }
}
