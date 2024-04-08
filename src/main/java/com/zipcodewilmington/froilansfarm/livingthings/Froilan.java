package com.zipcodewilmington.froilansfarm.livingthings;

import com.zipcodewilmington.froilansfarm.CropDuster;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Tractor;
import com.zipcodewilmington.froilansfarm.crops.CornRow;
import com.zipcodewilmington.froilansfarm.crops.CornStalk;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.crops.TomatoRow;
import com.zipcodewilmington.froilansfarm.interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.Stable;

import java.util.List;

public class Froilan extends Farmer {
    public Froilan() {
        CropDuster cropDuster = new CropDuster();
        Tractor tractor = new Tractor();
        List<FarmVehicle> farmVehicles = farm.getFarmVehicles();
        farmVehicles.add(cropDuster);
        farmVehicles.add(tractor);
        //field has 5 crop rows
        farm.getFarmField().add(new CornRow());
        farm.getFarmField().add(new TomatoRow());
        farm.getFarmField().add(new CropRow());
        farm.getFarmField().add(new CropRow());
        farm.getFarmField().add(new CropRow());
        //15 Chicken across 4 ChickenCoop
        farm.getChickenCoops().add(new ChickenCoop());
        farm.getChickenCoops().add(new ChickenCoop());
        farm.getChickenCoops().add(new ChickenCoop());
        farm.getChickenCoops().add(new ChickenCoop());
        ChickenCoop chickenCoop1 = farm.getChickenCoops().get(0);
        ChickenCoop chickenCoop2 = farm.getChickenCoops().get(1);
        ChickenCoop chickenCoop3 = farm.getChickenCoops().get(2);
        ChickenCoop chickenCoop4 = farm.getChickenCoops().get(3);
        chickenCoop1.add(new Chicken());
        chickenCoop1.add(new Chicken());
        chickenCoop1.add(new Chicken());
        chickenCoop1.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop2.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop3.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        chickenCoop4.add(new Chicken());
        farm.getStables().add(new Stable());
        farm.getStables().add(new Stable());
        farm.getStables().add(new Stable());
        Stable stable1 = farm.getStables().get(0);
        Stable stable2 = farm.getStables().get(1);
        Stable stable3 = farm.getStables().get(2);
        stable1.add(new Horse());
        stable1.add(new Horse());
        stable2.add(new Horse());
        stable3.add(new Horse());
        stable1.add(new Horse());
        stable2.add(new Horse());
        stable3.add(new Horse());
        stable1.add(new Horse());
        stable2.add(new Horse());
        stable3.add(new Horse());

    }
}
