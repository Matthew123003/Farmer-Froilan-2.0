package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {
    @Override
    public String makeNoise() {
        return "Vroom!";
    }

    public Edible harvest(Crop crop) {
        return crop.harvest();
    }

    @Override
    public boolean operate() {
        return hasRider();
    }
}
