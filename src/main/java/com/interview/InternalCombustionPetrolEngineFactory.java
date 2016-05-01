package com.interview;

/**
 * Created on 01/05/2016.
 */
public class InternalCombustionPetrolEngineFactory extends WidgetMachine{

    @Override
    protected Engine getEngine() {
        return new InternalCombustionEngine(FuelType.PETROL);
    }
}
