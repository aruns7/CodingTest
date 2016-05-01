package com.interview;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created on 01/05/2016.
 */
public class InternalCombustionEngineTest {

    Engine internalCombustionEnginePetrol = new InternalCombustionEngine(FuelType.PETROL);
    Engine internalCombustionEngineDiesel= new InternalCombustionEngine(FuelType.DIESEL);

    @Test
    public void setUpTest(){
        assertTrue("engine empty, no petrol" , internalCombustionEnginePetrol.getFuelLevel()==0);
    }

    @Test
    public void engineRequiredFuelTypeTest(){
        assertTrue("internal Comb engine required fuel type petrol", internalCombustionEnginePetrol.getFuelType().equals(FuelType.PETROL));
        assertTrue("internal Comb engine correctly required fuel type diesel", internalCombustionEngineDiesel.getFuelType().equals(FuelType.DIESEL));
    }

    @Test
    public void internalCombustionEngineInitialised(){
        assertTrue("engine not running", !internalCombustionEngineDiesel.isRunning());
        internalCombustionEngineDiesel.fill(FuelType.DIESEL, 100);
        internalCombustionEngineDiesel.start();
        assertTrue("internal combustion engine running", internalCombustionEngineDiesel.isRunning() );
    }

    @Test(expected=IllegalStateException.class)
    public void internalCombustionEngineIncorrectlyInitialised(){
        assertTrue("engine not running", !internalCombustionEngineDiesel.isRunning());
        internalCombustionEngineDiesel.fill(FuelType.PETROL, 100);
        internalCombustionEngineDiesel.start();
        assertTrue("internal combustion engine running", !internalCombustionEngineDiesel.isRunning() );
    }


}
