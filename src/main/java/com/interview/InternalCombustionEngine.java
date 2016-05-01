package com.interview;

public class InternalCombustionEngine {

    private boolean running;
    private int fuelLevel;
    private FuelType requiredFuelType;
    private FuelType fuelType;

    public InternalCombustionEngine(FuelType requiredFuelType) {
        this.requiredFuelType = requiredFuelType;
        running = false;
        fuelLevel = 0;
    }

    public void start() {
        if (fuelLevel > 0 && requiredFuelType.equals(fuelType)) {
            running = true;
        } else {
            throw new IllegalStateException("Not able to start engine.");
        }
    }

    public void stop() {
        running = false;
    }

    public boolean isRunning() {
        return running;
    }

    public void fill(FuelType fuelType, int fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        }
        else if (fuelLevel > 100) {
            this.fuelLevel = 100;
        }
        else {
            this.fuelLevel = 0;
        }

        this.fuelType = fuelType;
    }

    public FuelType getFuelType() {
        return  requiredFuelType;
    }

    public int getProduceCost(int quantity){
        //todo refactor: create batch abstraction:cost per batch, batch size, noOfBatches, cost(noBatches*costPerBatch)
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
