package com.zipcodewilmington.froilansfarm.livingthings;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Vehicle;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.Crop;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.interfaces.Botanist;
import com.zipcodewilmington.froilansfarm.interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.interfaces.Rider;

public class Farmer extends Person implements Rider, Botanist, NoiseMaker {
    Farm farm = new Farm();

    public Farm getFarm() {
        return farm;
    }

    @Override
    public boolean mount(Rideable rideable) {
        if (rideable instanceof Vehicle){
            Vehicle vehicle = (Vehicle) rideable;
            vehicle.setRider(this);
        }
        else if(rideable instanceof Horse){
            Horse horse = (Horse) rideable;
            horse.setRider(this);
        }

        return rideable.hasRider();
    }

    @Override
    public void plant(CropRow<Crop> cropRow, Crop crop) {
        cropRow.add(crop);
    }

    @Override
    public String makeNoise() {
        return "Yee haw";
    }
}
