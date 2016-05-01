package com.interview;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * Created on 01/05/2016.
 */
public class WidgetMachineTest {

    @Test
    public void produceWidget() {
        WidgetMachine machine = new WidgetMachine();
        int costTwoWidgets = machine.produceWidgets(2);
        int costTenWidgets = machine.produceWidgets(10);
        assertEquals("create 2 widgets for internal combustion engine filled with petrol", 9, costTwoWidgets);
        assertEquals("create 10 widgets for internal combustion engine filled with petrol", 18,  costTenWidgets) ;
    }
}
