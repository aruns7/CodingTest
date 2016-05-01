package com.interview;

import java.math.BigDecimal;

public class InternalCombustionEngine extends AbstractEngine{

    /**
     * Constructor
     * @param requiredFuelType the required fuel type
     */
    public InternalCombustionEngine(FuelType requiredFuelType) {
        super(requiredFuelType);
    }

    public void fill(FuelType fuelType, int fuelLevel) {
        if(requiredFuelType==fuelType){
            if(fuelType==FuelType.DIESEL || fuelType==FuelType.PETROL){
                super.fill(fuelType, fuelLevel);
            }
        }
    }

    public BigDecimal getProduceCost(int quantity){
        int batch = 0;
        int batchCount = 0;
        int costPerBatch = 0;

        if (getFuelType() == FuelType.PETROL) {
            costPerBatch = 9;
        } else if (getFuelType() == FuelType.DIESEL) {
            costPerBatch = 12;
        }

        while (batch < quantity) {
            batch = batch + 8;
            batchCount++;
        }

        return new BigDecimal(batchCount * costPerBatch);    }
}
