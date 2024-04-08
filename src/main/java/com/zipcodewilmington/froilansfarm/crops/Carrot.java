package com.zipcodewilmington.froilansfarm.crops;

public class Carrot extends Crop <CarrotRoot>{
    @Override
    public CarrotRoot yield() {
        return hasBeenFertilized() && !hasBeenHarvested()? new CarrotRoot(): null;
    }
}
