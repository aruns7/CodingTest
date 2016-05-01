package com.interview;

import org.junit.*;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * Created on 01/05/2016.
 */
public class WidgetMachineTest {

    private WidgetMachine internalCombustionEnginePetrolWidgetMachine= WidgetMachine.INTERNAL_COMBUSTION_PETROL_ENGINE;
    private WidgetMachine internalCombustionEngineDieselWidgetMachine=WidgetMachine.INTERNAL_COMBUSTION_DIESEL_ENGINE;

    private WidgetMachine steamEngineCoalWidgetMachine=WidgetMachine.STEAM_COAL_ENGINE;
    private WidgetMachine steamEngineWoodWidgetMachine=WidgetMachine.STEAM_WOOD_ENGINE;

    @Test
    public void produceWidget() {

        assertEquals("create 2 widgets for internal combustion engine filled with petrol", new BigDecimal(9), internalCombustionEnginePetrolWidgetMachine.produceWidgets(2));
        assertEquals("create 10 widgets for internal combustion engine filled with petrol", new BigDecimal(18), internalCombustionEnginePetrolWidgetMachine.produceWidgets(10));

        assertEquals("create 2 widgets for internal combustion engine filled with diesel", new BigDecimal(12), internalCombustionEngineDieselWidgetMachine.produceWidgets(2));
        assertEquals("create 10 widgets for internal combustion engine filled with diesel", new BigDecimal(24), internalCombustionEngineDieselWidgetMachine.produceWidgets(10));

        assertEquals("create 1 widgets for internal steam engine filled with coal", new BigDecimal("5.65"), steamEngineCoalWidgetMachine.produceWidgets(1));
        assertEquals("create 3 widgets for internal steam engine filled with coal", new BigDecimal("11.30"), steamEngineCoalWidgetMachine.produceWidgets(3));

        assertEquals("create 1 widgets for internal steam engine filled with wood", new BigDecimal("4.35"), steamEngineWoodWidgetMachine.produceWidgets(1));
        assertEquals("create 3 widgets for internal steam engine filled with coal", new BigDecimal("8.70"), steamEngineWoodWidgetMachine.produceWidgets(3));



    }
}
