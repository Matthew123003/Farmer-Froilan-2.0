package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.FarmField;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.storage.Stable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Farm {
    FarmField farmField = new FarmField();
    List<FarmVehicle> farmVehicles = new ArrayList<>();
    List<ChickenCoop> chickenCoops = new ArrayList<>();
    List<Stable> stables = new ArrayList<>();
    FarmHouse farmHouse = new FarmHouse();
    public List<Stable> getStables() {
        return stables;
    }

    public List<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public FarmField getFarmField() {
        return farmField;
    }

    public int countChickens() {
        int chickenCount = 0;
        for (ChickenCoop coop: chickenCoops
             ) {
            chickenCount += coop.size();

        }
        return chickenCount;
    }

    public int countHorses() {
        int horseCount = 0;
        for (Stable stable: stables
        ) {
            horseCount += stable.size();

        }
        return horseCount;
    }

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }

    public Aircraft getAirCraft() {
        for (FarmVehicle farmvehicle:farmVehicles
             ) {
            if (farmvehicle instanceof Aircraft){
                return (Aircraft) farmvehicle;
            }
        }
        return null;
    }
}
