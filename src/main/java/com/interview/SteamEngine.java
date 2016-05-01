package com.interview;

public class SteamEngine extends AbstractEngine{

    /**
     * Constructor
     * @param requiredFuelType the required fuel type
     */
    public SteamEngine(FuelType requiredFuelType) {
        super(requiredFuelType);
    }

    public void fill(FuelType fuelType, int fuelLevel) {
        if(requiredFuelType==fuelType){
            if(fuelType==FuelType.WOOD || fuelType==FuelType.COAL){
                super.fill(fuelType, fuelLevel);
            }
        }
    }
    public int getProduceCost(int quantity){
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

        return batchCount * costPerBatch;
    }
}
