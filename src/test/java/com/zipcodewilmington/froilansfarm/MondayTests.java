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

public class MondayTests {
//    The Plot Thickens Chickens...
//    Create test cases which simulate a typical work-week for Froilan and Froilanda.

//    The accumulation of your test cases should ensure at least 80% test coverage.
//    The first few weekdays have already been considered for you.
//
//    Create a separate Test class for each day in the following scenario.
//

//    As a farmer, Froilan must stick to a rigorous agricultural routine.
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

//
//    On Monday, his sister, Froilanda uses the CropDuster to fly over the Field and fertilize each of the CropRow
//
    @Test
    public void FroilandaFlyCropdusterAndFertilizesCropRowsTest(){
        Froilan froilan = new Froilan();
        Farm farm = froilan.getFarm();
        FarmField farmField = farm.getFarmField();
        Froilanda froilanda = new Froilanda();
        CropDuster cropDuster = new CropDuster();
        froilanda.mount(cropDuster);

        for (CropRow<Crop> cropRow : farmField
             ) {
            cropDuster.fertilize(cropRow);
            for (Crop crop : cropRow
                    ) {
                Assert.assertTrue(crop.hasBeenFertilized());
            }
        }
        Assert.assertTrue(froilanda.mount(cropDuster));
    }



}
