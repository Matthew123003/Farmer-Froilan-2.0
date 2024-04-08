package com.zipcodewilmington.froilansfarm.crops;

public class TomatoPlant extends Crop<Tomato> {
    @Override
    public Tomato yield() {
        return hasBeenFertilized() && !hasBeenHarvested()? new Tomato(): null;
    }
}
