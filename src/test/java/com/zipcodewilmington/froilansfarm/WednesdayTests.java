package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.crops.EarCorn;
import com.zipcodewilmington.froilansfarm.crops.EdibleEgg;
import com.zipcodewilmington.froilansfarm.crops.Tomato;
import com.zipcodewilmington.froilansfarm.livingthings.Froilan;
import com.zipcodewilmington.froilansfarm.livingthings.Froilanda;
import com.zipcodewilmington.froilansfarm.livingthings.Horse;
import com.zipcodewilmington.froilansfarm.storage.Stable;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class WednesdayTests {
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

}
