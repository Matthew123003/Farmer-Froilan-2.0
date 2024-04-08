package com.zipcodewilmington.froilansfarm.crops;

public class CornStalk extends Crop<EarCorn> {
    @Override
    public EarCorn yield() {
        return hasBeenFertilized() && !hasBeenHarvested()? new EarCorn(): null;
    }
}
