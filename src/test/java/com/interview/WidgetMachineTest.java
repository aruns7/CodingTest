package com.interview;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created on 01/05/2016.
 */
public class WidgetMachineTest {

    private WidgetMachine internalCombustionEnginePetrolWidgetMachine= WidgetMachine.INTERNAL_COMBUSTION_PETROL_ENGINE;
    private WidgetMachine internalCombustionEngineDieselWidgetMachine=WidgetMachine.INTERNAL_COMBUSTION_DIESEL_ENGINE;


    @Test
    public void produceWidget() {
        int costTwoWidgets = internalCombustionEnginePetrolWidgetMachine.produceWidgets(2);
        int costTenWidgets = internalCombustionEnginePetrolWidgetMachine.produceWidgets(10);
        assertEquals("create 2 widgets for internal combustion engine filled with petrol", 9, costTwoWidgets);
        assertEquals("create 10 widgets for internal combustion engine filled with petrol", 18,  costTenWidgets) ;
    }
}
