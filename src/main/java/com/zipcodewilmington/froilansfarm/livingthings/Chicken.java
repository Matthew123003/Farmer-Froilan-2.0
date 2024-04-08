package com.zipcodewilmington.froilansfarm.livingthings;

import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.EdibleEgg;
import com.zipcodewilmington.froilansfarm.interfaces.Produce;

public class Chicken extends Animal<EarCorn> implements Produce<EdibleEgg> {
    private boolean hasBeenFertilized = false;

    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    @Override
    public EdibleEgg yield() {
//        if(!hasBeenFertilized){
//            return new EdibleEgg();
//        }
//        else{
//            return null;
//        }

        return (!hasBeenFertilized) ? new EdibleEgg(): null ;
    }

    @Override
    public boolean hasBeenFertilized() {
        return hasBeenFertilized;
    }

    public boolean isHasBeenFertilized() {
        return hasBeenFertilized;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

    public void fertilize() {
        setHasBeenFertilized(true);
    }

}
