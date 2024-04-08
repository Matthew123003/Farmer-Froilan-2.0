package com.zipcodewilmington.froilansfarm.interfaces;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;

public interface Produce <T extends Edible> {
    T yield();
    boolean hasBeenFertilized();

    void fertilize();
}
