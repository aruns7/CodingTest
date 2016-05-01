package com.interview;

/**
 * Created on 01/05/2016.
 */
public class InternalCombustionDieselEngineFactory extends WidgetMachine{

    @Override
    protected Engine getEngine() {
        return new InternalCombustionEngine(FuelType.DIESEL);
    }
}
