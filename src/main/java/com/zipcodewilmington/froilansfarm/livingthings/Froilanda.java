package com.zipcodewilmington.froilansfarm.livingthings;

import com.zipcodewilmington.froilansfarm.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicle;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Edible;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;

public class Froilanda extends Person implements Pilot {
    @Override
    public boolean mount(Aircraft aircraft) {
        CropDuster cropDuster = (CropDuster) aircraft;
        cropDuster.setRider(this);
        return  cropDuster.hasRider();
    }

}
