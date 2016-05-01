package com.interview;

/**
 * Created on 01/05/2016.
 */
public class SteamCoalEngineFactory extends WidgetMachine{

    @Override
    protected Engine getEngine() {
        return new SteamEngine(FuelType.COAL);
    }
}
