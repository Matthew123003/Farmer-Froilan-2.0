package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.CornRow;
import com.zipcodewilmington.froilansfarm.crops.CropRow;
import com.zipcodewilmington.froilansfarm.crops.TomatoRow;
import com.zipcodewilmington.froilansfarm.interfaces.Aircraft;
import com.zipcodewilmington.froilansfarm.interfaces.Pilot;
import com.zipcodewilmington.froilansfarm.livingthings.Farmer;
import com.zipcodewilmington.froilansfarm.livingthings.Froilan;
import com.zipcodewilmington.froilansfarm.livingthings.Froilanda;
import com.zipcodewilmington.froilansfarm.storage.FarmField;
import org.junit.Assert;
import org.junit.Test;

public class EstablishingThePlot {
//    Establishing The Plot
//    Froilan, a Farmer has a Farm consisting of
    @Test
    public void FroilanFarmerTest(){
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan instanceof Farmer);
    }
    @Test
    public void FroilanHasFarm(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertNotNull(farm);
    }

//1 Field of 5 CropRow.

    @Test
    public void FroilanFarmHasField(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        Assert.assertNotNull(farmField);
    }
    @Test
    public void FroilanFarmFieldHas5CropRows(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        Assert.assertEquals(5, farmField.size());
    }

    //
    //            Row 1 has Corn
    @Test
    public void CropRow1HasCornTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow cropRow = farmField.get(0);
        Assert.assertTrue(cropRow instanceof CornRow);
    }
    //    Row 2 has Tomato
    @Test
    public void CropRow2HasTomatoTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow cropRow = farmField.get(1);
        Assert.assertTrue(cropRow instanceof TomatoRow);

    }
//    Row 3 and beyond grows arbitrary vegetation.
    @Test
    public void CropRow3Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow cropRow = farmField.get(2);
        Assert.assertTrue(cropRow instanceof CropRow);

    }
    @Test
    public void CropRow4Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow cropRow = farmField.get(3);
        Assert.assertTrue(cropRow instanceof CropRow);

    }
    @Test
    public void CropRow5Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow cropRow = farmField.get(4);
        Assert.assertTrue(cropRow instanceof CropRow);
    }
//15 Chicken across 4 ChickenCoop

    @Test
    public void ChickenCoopsAre4Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertEquals(4, farm.getChickenCoops().size());
    }

    @Test
    public void ChickenTotals15Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertEquals(15, farm.countChickens());
    }

//10 Horse across 3 Stable.
    @Test
    public void StablesAre3Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertEquals(3, farm.getStables().size());
    }

    @Test
    public void HorsesTotals10Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertEquals(10, farm.countHorses());
    }
//
//2 FarmVehicle
    @Test
    public void FarmVehiclesTotal2Test(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertEquals(2, farm.getFarmVehicles().size());
    }
    //1 Aircraft
    @Test
    public void FarmHasAircraftTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        Assert.assertTrue(farm.getAirCraft() instanceof Aircraft);
    }
    //
    //    His sister, Froilanda, is a Pilot who uses a CropDuster.

    @Test
    public void FroilandaPilotTest(){
        Froilanda froilanda = new Froilanda();
        Assert.assertTrue(froilanda instanceof Pilot);
    }
    @Test
    public void FroilandaMountAircraftTest(){
        Froilanda froilanda = new Froilanda();
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(froilanda.mount(cropDuster));
    }

}
