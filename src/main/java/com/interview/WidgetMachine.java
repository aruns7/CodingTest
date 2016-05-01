package com.interview;

import java.math.BigDecimal;

public abstract class WidgetMachine {

    public static final WidgetMachine INTERNAL_COMBUSTION_DIESEL_ENGINE=new InternalCombustionDieselEngineFactory();
    public static final WidgetMachine INTERNAL_COMBUSTION_PETROL_ENGINE=new InternalCombustionPetrolEngineFactory();
    public static final WidgetMachine STEAM_WOOD_ENGINE=new SteamWoodEngineFactory();
    public static final WidgetMachine STEAM_COAL_ENGINE=new SteamCoalEngineFactory();

    public BigDecimal produceWidgets(int quantity) {
        Engine engine=getEngine();
        engine.fill(engine.getFuelType(), 100);
        engine.start();
        BigDecimal cost = new BigDecimal(0);

        if (engine.isRunning()) {
            cost = engine.getProduceCost(quantity);
        }

        engine.stop();

        return cost;
    }

    protected abstract Engine getEngine();

}
