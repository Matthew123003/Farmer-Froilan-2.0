package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.*;
import com.zipcodewilmington.froilansfarm.livingthings.Froilan;
import com.zipcodewilmington.froilansfarm.livingthings.Froilanda;
import com.zipcodewilmington.froilansfarm.livingthings.Horse;
import com.zipcodewilmington.froilansfarm.storage.FarmField;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SundayTests {
    //    Every morning, Froilan and Froilanda begin their morning by
//
//    Riding each Horse in each Stable.
    @Test
    public void FroilanRideEachHorseInStable(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        List<Stable> stables = farm.getStables();
        for (Stable stable: stables
        ) {
            for (Horse horse:stable
            ) {
                Assert.assertTrue(froilan.mount(horse));
            }

        }

    }
    //    Feeding each Horse 3 ear of Corn.
    @Test
    public void FroilanFeedEachHorse3EarCorn(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        List<Stable> stables = farm.getStables();
        for (Stable stable: stables
        ) {
            for (Horse horse:stable
            ) {
                EarCorn earCorn1 = new EarCorn();
                EarCorn earCorn2 = new EarCorn();
                EarCorn earCorn3 = new EarCorn();
                Assert.assertTrue(horse.eat(earCorn1));
                Assert.assertTrue(horse.eat(earCorn2));
                Assert.assertTrue(horse.eat(earCorn3));
            }
        }
    }
    //            For breakfast,
//    Froilan eats 1 EarCorn, 2 Tomatoes, and 5 Egg.
    @Test
    public void FroilanBreakfast() {
        Froilan froilan = new Froilan();
        Assert.assertTrue(froilan.eat(new EarCorn()));
        Assert.assertTrue(froilan.eat(new Tomato()));
        Assert.assertTrue(froilan.eat(new Tomato()));
        Assert.assertTrue(froilan.eat(new EdibleEgg()));
        Assert.assertTrue(froilan.eat(new EdibleEgg()));
        Assert.assertTrue(froilan.eat(new EdibleEgg()));
        Assert.assertTrue(froilan.eat(new EdibleEgg()));
        Assert.assertTrue(froilan.eat(new EdibleEgg()));
    }

    //    Froilanda eats 2 EarCorn, 1 Tomato, and 2 Egg.
    @Test
    public void FroilandaBreakfast() {
        Froilanda froilanda = new Froilanda();
        Assert.assertTrue(froilanda.eat(new EarCorn()));
        Assert.assertTrue(froilanda.eat(new EarCorn()));
        Assert.assertTrue(froilanda.eat(new Tomato()));
        Assert.assertTrue(froilanda.eat(new EdibleEgg()));
        Assert.assertTrue(froilanda.eat(new EdibleEgg()));
    }

//            Sunday, Froilan plants 3 different type of Crop in his first, second, and third CropRow.
    @Test
    public void FroilanPlantCropRow1() {
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow cornRow =  farmField.get(0);
        CornStalk cornStalk = new CornStalk();

        froilan.plant(cornRow, cornStalk);
        Assert.assertEquals(1, cornRow.size());
    }
    @Test
    public void FroilanPlantCropRow2() {
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow tomatoRow = farmField.get(1);
        TomatoPlant tomatoPlant = new TomatoPlant();

        froilan.plant(tomatoRow, tomatoPlant);
        Assert.assertEquals(1, tomatoRow.size());
    }
    @Test
    public void FroilanPlantCropRow3() {
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        CropRow carrotRow = farmField.get(2);
        Carrot carrot = new Carrot();

        froilan.plant(carrotRow, carrot);
        Assert.assertEquals(1, carrotRow.size());

    }

}
