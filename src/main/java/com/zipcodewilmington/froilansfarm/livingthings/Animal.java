package com.zipcodewilmington.froilansfarm.livingthings;

import com.zipcodewilmington.froilansfarm.interfaces.Eater;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;

public  abstract class Animal<T extends Edible> implements Eater<T>, NoiseMaker {
    public boolean eat(T food) {
        return food != null;
    }
}
