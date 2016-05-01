package com.interview;

public abstract class WidgetMachine {

    public static final WidgetMachine INTERNAL_COMBUSTION_DIESEL_ENGINE=new InternalCombustionDieselEngineFactory();
    public static final WidgetMachine INTERNAL_COMBUSTION_PETROL_ENGINE=new InternalCombustionPetrolEngineFactory();

    public int produceWidgets(int quantity) {
        Engine engine=getEngine();
        engine.fill(engine.getFuelType(), 100);
        engine.start();
        int cost = 0;

        if (engine.isRunning()) {
            cost = engine.getProduceCost(quantity);
        }

        engine.stop();

        return cost;
    }

    protected abstract Engine getEngine();

}
