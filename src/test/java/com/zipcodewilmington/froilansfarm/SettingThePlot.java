package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.*;
import com.zipcodewilmington.froilansfarm.interfaces.*;
import com.zipcodewilmington.froilansfarm.livingthings.*;
import com.zipcodewilmington.froilansfarm.storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.storage.FarmField;
import com.zipcodewilmington.froilansfarm.storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SettingThePlot {
    //Horse is an Animal and Rideable
    @Test
    public void HorseIsAnimalTest(){
        Animal horse = new Horse();
        Assert.assertTrue(horse instanceof Horse);
    }
    @Test
    public void HorseIsRideableTest(){
        Rideable horse = new Horse();
        Assert.assertTrue(horse instanceof Horse);
    }

    @Test
    public void HorseIsEaterTest(){
        Horse horse = new Horse();
        Assert.assertTrue(horse instanceof Eater);

    }
    //Eater can eat an Edible object.

    @Test
    public void EaterCanEatEdibleTest(){
        EarCorn earCorn = new EarCorn();
        Horse horse = new Horse();
        Assert.assertTrue(horse.eat(earCorn));
    }
    //NoiseMaker can makeNoise
    @Test
    public void NoiseMakerCanMakeNoiseTest(){
        NoiseMaker horse = new Horse();
        String expected = "Neigh!";
        Assert.assertEquals(expected, horse.makeNoise());


    }
    //Animal is a NoiseMaker and Eater
    @Test
    public void AnimalIsNoiseMakerAndEaterTest(){
        Animal horse = new Horse();
        String expected = "Neigh!";
        Assert.assertEquals(expected, horse.makeNoise());

    }

    //Chicken is an Animal and a Produce which yield an EdibleEgg if hasBeenFertilized flag is false.

    @Test
    public void ChickenIsAnimalTest(){
        Animal chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Chicken);
    }
    @Test
    public void ChickenIsProduceTest(){
        Chicken chicken = new Chicken();
        Assert.assertTrue(chicken instanceof Produce);
    }

    @Test
    public void ChickenFertilizedTest(){
        Chicken chicken = new Chicken();
        chicken.fertilize();
        Assert.assertTrue(chicken.hasBeenFertilized());
    }

    @Test
    public void ChickenUnFertilizedTest(){
        Chicken chicken = new Chicken();
        Assert.assertFalse(chicken.hasBeenFertilized());
    }
    @Test
    public void ChickenYieldFertilizedTest(){
        Chicken chicken = new Chicken();
        chicken.fertilize();
        Object egg = chicken.yield();
        Assert.assertTrue(egg == null);
    }
    @Test
    public void ChickenYieldUnFertilizedTest(){
        Chicken chicken = new Chicken();
        EdibleEgg egg = chicken.yield();
        Assert.assertTrue(egg != null);
    }



//    Produce can yield an Edible object depending on their hasBeenFertilized flag.
    @Test
    public void ProduceTest(){
        Produce cornStalk = new CornStalk();
        cornStalk.fertilize();
        Object earCorn =  cornStalk.yield();
        Assert.assertTrue(earCorn instanceof Edible);
    }
//    Crop is a Produce which can yield an Edible object depending on its hasBeenHarvested and hasBeenFertilized flag.

    @Test
    public void CropTest(){
        Crop cornStalk = new CornStalk();
        cornStalk.fertilize();
        Edible earCorn =  cornStalk.yield();
        Assert.assertTrue(earCorn != null);
    }

    @Test
    public void CropHarvestedTest(){
        Crop cornStalk = new CornStalk();
        cornStalk.fertilize();
        cornStalk.harvest();
        Edible earCorn =  cornStalk.yield();
        Assert.assertTrue(earCorn == null);
    }
    @Test
    public void CropUnfertilizedTest(){
        Crop cornStalk = new CornStalk();
        Object earCorn =  cornStalk.yield();
        Assert.assertTrue(earCorn == null);
    }
    //    CornStalk is a Crop which can yield a EarCorn
    @Test
    public void CornStalkCropTest(){
        Crop cornStalk = new CornStalk();
        cornStalk.fertilize();
        Object earCorn =  cornStalk.yield();
        Assert.assertTrue(earCorn instanceof EarCorn);
    }
//    TomatoPlant is a Crop which can yield a Tomato
    @Test
    public void TomatoPlantCropTest(){
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Object tomato =  tomatoPlant.yield();
        Assert.assertTrue(tomato instanceof Tomato);
    }

//    CropRow can store many Crop.
    @Test
    public void CropRowTest(){
        CropRow<TomatoPlant> cropRow  = new CropRow<>();
        TomatoPlant tomatoPlant1 = new TomatoPlant();
        TomatoPlant tomatoPlant2 = new TomatoPlant();
        cropRow.add(tomatoPlant1);
        cropRow.add(tomatoPlant2);
        Assert.assertEquals(2,cropRow.size());
    }

//    Field can store many CropRow
    @Test
    public void FieldStoreCropRowTest(){
       FarmField farmField = new FarmField();
        CropRow<TomatoPlant> cropRow1  = new CropRow<>();
        CropRow<CornStalk> cropRow2  = new CropRow<>();
        farmField.add(cropRow1);
        farmField.add(cropRow2);
        Assert.assertEquals(2,farmField.size());
    }
    //    Rider can mount and dismount a Rideable object.
    @Test
    public void RiderCanMountTest(){
        Rider farmer = new Farmer();
        Horse horse = new Horse();
        Assert.assertTrue(farmer.mount(horse));


    }
    //    Botanist can plant a Crop in a CropRow.
    @Test
    public void BotanistCanPlantTest(){
        Botanist farmer = new Farmer();
        CropRow<Crop> cornStalkCropRow = new CropRow<>();
        CornStalk cornStalk = new CornStalk();
        farmer.plant(cornStalkCropRow,cornStalk);
        Assert.assertTrue(cornStalkCropRow.size() == 1);
    }

    //    Person can makeNoise and can eat an Edible object.
    @Test
    public void PersonCanmakeNoiseTest(){
        NoiseMaker farmer = new Farmer();
        String noise = "Yee haw";
        Assert.assertEquals(noise, farmer.makeNoise());
    }

//
//    Farmer is an Eater, a Rider, a Botanist, and a Person.
    @Test
    public void FarmerEaterTest(){
        Farmer farmer = new Farmer();
        Assert.assertTrue(farmer instanceof Eater);
    }

//    Stable stores many Horse.
    @Test
    public void StableHoldHorsesTest(){
        Horse horse1 = new Horse();
        Horse horse2 = new Horse();
        Stable stable = new Stable();
        stable.add(horse1);
        stable.add(horse2);
        Assert.assertEquals(2,stable.size());
    }

//    FarmHouse stores many Person
    @Test
    public void FarmHouseManyPersonTest(){
        Person person1 = new Farmer();
        Person person2 = new Farmer();
        FarmHouse farmHouse = new FarmHouse();
        farmHouse.add(person1);
        farmHouse.add(person2);
        Assert.assertEquals(2,farmHouse.size());
    }

//
//    ChickenCoop stores many Chicken
    @Test
    public void ChickenCoopManyChickenTest(){
        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken();
        ChickenCoop chickenCoop = new ChickenCoop();
        chickenCoop.add(chicken1);
        chickenCoop.add(chicken2);
        Assert.assertEquals(2,chickenCoop.size());
    }
//    Farm stores many Stable, many ChickenCoop, and a single FarmHouse
    @Test
    public void FarmManyStableTest(){
        Farm farm = new Farm();
        List<Stable> stableList = farm.getStables();
        Stable stable1 = new Stable();
        Stable stable2 = new Stable();
        stableList.add(stable1);
        stableList.add(stable2);
        Assert.assertEquals(2, farm.getStables().size());
    }

    @Test
    public void FarmManyChickenCoopTest(){
        Farm farm = new Farm();
        List<ChickenCoop> chickenCoopList = farm.getChickenCoops();
        ChickenCoop chickenCoop1 = new ChickenCoop();
        ChickenCoop chickenCoop2 = new ChickenCoop();
        chickenCoopList.add(chickenCoop1);
        chickenCoopList.add(chickenCoop2);
        Assert.assertEquals(2, farm.getChickenCoops().size());
    }

    @Test
    public void FarmFarmHouseTest(){
        Farm farm = new Farm();
        Object farmHouse = farm.getFarmHouse();
        Assert.assertTrue(farmHouse instanceof FarmHouse);

    }
//




    //    Vehicle are NoiseMaker and Rideable
    @Test
    public void VehicleNoiseMakerTest(){
        Vehicle tractor = new Tractor();
        Assert.assertTrue(tractor instanceof NoiseMaker);
    }

    @Test
    public void VehicleRideableTest(){
        Vehicle tractor = new Tractor();
        Assert.assertTrue(tractor instanceof Rideable);
    }

    //    FarmVehicle can operate on a Farm

    @Test
    public void FarmVehicleCanOperateTest(){
        FarmVehicle tractor = new Tractor();
        Froilan froilan = new Froilan();
        froilan.mount((Rideable) tractor);
        Assert.assertTrue(tractor.operate());
    }
//    Tractor is a FarmVehicle which can harvest a Crop.

    @Test
    public void TractorFarmVehicleTest(){
        Tractor tractor = new Tractor();
        Assert.assertTrue(tractor instanceof FarmVehicle);
    }
    @Test
    public void TractorCanHarvestCropTest(){
        Tractor tractor = new Tractor();
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        Object harvest = tractor.harvest(tomatoPlant);
        Assert.assertTrue(harvest instanceof Edible);
    }

    //    Aircraft are Vehicle which can fly
    @Test
    public void AircraftVehicleTest(){
        Aircraft cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Vehicle);
    }

    @Test
    public void AircraftFlyTest(){
        Aircraft cropDuster = new CropDuster();
        Froilanda froilanda = new Froilanda();
        froilanda.mount(cropDuster);

        Assert.assertTrue(cropDuster.fly());
    }

//    CropDuster is a FarmVehicle and Aircraft which can fertilize a CropRow
    @Test
    public void CropDusterFarmVehicleTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof FarmVehicle);
    }

    @Test
    public void CropDusterAircraftTest(){
        CropDuster cropDuster = new CropDuster();
        Assert.assertTrue(cropDuster instanceof Aircraft);
    }

    @Test
    public void CropDusterFertilizeTest(){
        CropRow<CornStalk> cornStalkCropRow = new CropRow<>();
        CornStalk cornStalk = new CornStalk();
        cornStalkCropRow.add(cornStalk);
        CropDuster cropDuster = new CropDuster();
        cropDuster.fertilize(cornStalkCropRow);
        Assert.assertTrue(cornStalkCropRow.get(0).hasBeenFertilized());
    }
}
