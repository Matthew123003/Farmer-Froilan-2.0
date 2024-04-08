package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;

public class CropDuster  extends Vehicle implements Aircraft, FarmVehicle {
    @Override
    public boolean fly() {
        return hasRider();
    }

    public void fertilize(CropRow cropRow) {
        CropRow<Crop> crops = cropRow;
        for (Crop crop:crops
             ) {
            crop.fertilize();
        }
    }

    @Override
    public boolean operate() {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Swooshing";
    }
}
