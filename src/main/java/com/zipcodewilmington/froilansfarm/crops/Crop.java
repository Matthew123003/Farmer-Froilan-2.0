package com.zipcodewilmington.froilansfarm.crops;

import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public abstract class Crop<T extends Edible> implements Produce<T> {

    private boolean hasBeenFertilized = false;
    private boolean hasBeenHarvested = false;

    @Override
    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    @Override
    public void fertilize() {
        System.out.println("Ferrt");
        setHasBeenFertilized(true);
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
        hasBeenHarvested = false;
    }

    public boolean hasBeenHarvested() {
        return hasBeenHarvested;
    }

    public T harvest(){
        T product = yield();
        hasBeenHarvested = true;
        System.out.println(product);
        return product;
    }

    @Override
    public String toString() {
        return "Crop{" +
                "hasBeenFertilized=" + hasBeenFertilized +
                ", hasBeenHarvested=" + hasBeenHarvested +
                '}';
    }
}
