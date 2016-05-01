package com.interview;

import java.math.BigDecimal;

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

    private BigDecimal costPerBatch=new BigDecimal("0");
    private final BigDecimal costPerBatchForWood=new BigDecimal("4.35");
    private final BigDecimal costPerBatchForCoal=new BigDecimal("5.65");

    public BigDecimal getProduceCost(int quantity){
        //todo refactor: batch:cost per batch, batch size, noOfBatches, cost(noBatches*costPerBatch) should be in a batch abstraction
        int batch = 0;
        int batchCount = 0;
        if (getFuelType() == FuelType.WOOD) {
            costPerBatch = costPerBatchForWood;
        } else if (getFuelType() == FuelType.COAL) {
            costPerBatch = costPerBatchForCoal;
        }

        while (batch < quantity) {
            batch = batch + 2;
            batchCount++;
        }
        return costPerBatch.multiply(new BigDecimal(batchCount) );
    }

}
