package com.interview;

/**
 * Created on 01/05/2016.
 */
public class SteamWoodEngineFactory extends WidgetMachine{

    @Override
    protected Engine getEngine() {
        return new SteamEngine(FuelType.WOOD);
    }
}
