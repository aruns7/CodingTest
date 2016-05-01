package com.interview;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created on 01/05/2016.
 */
public class SteamEngineTest {

    Engine steamEngineWood = new SteamEngine(FuelType.WOOD);
    Engine steamEngineCoal= new SteamEngine(FuelType.COAL);

    @Test
    public void engineRequiredFuelTest(){
        assertTrue("internal Comb engine required fuel type wood", steamEngineWood.getFuelType().equals(FuelType.WOOD));
        assertTrue("internal Comb engine required fuel type coal", steamEngineCoal.getFuelType().equals(FuelType.COAL));
    }

    @Test
    public void steamEngineInitialised(){
        assertTrue("engine not running", !steamEngineWood.isRunning());
        steamEngineWood.fill(FuelType.WOOD, 100);
        steamEngineWood.start();
        assertTrue("steam engine running", steamEngineWood.isRunning() );
    }

    @Test(expected=IllegalStateException.class)
    public void steamEngineIncorrectlyInitialised(){
        assertTrue("engine not running", !steamEngineWood.isRunning());
        steamEngineWood.fill(FuelType.PETROL, 100);
        steamEngineWood.start();
    }

    @Test
    public void steamEngineNotRunning(){
        assertTrue("engine not running", !steamEngineWood.isRunning());
        steamEngineWood.fill(FuelType.PETROL, 100);
        assertTrue("engine still not running!", !steamEngineWood.isRunning());
    }


}
