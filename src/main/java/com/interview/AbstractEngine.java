package com.interview;

import java.math.BigDecimal;

/**
 * Created on 01/05/2016.
 */
public abstract class AbstractEngine implements Engine{

    protected boolean running;
    protected int fuelLevel;
    protected FuelType requiredFuelType;
    protected FuelType fuelType;

    /**
     * Constructor
     * @param requiredFuelType the required fuel type accepted by engine
     */
    public AbstractEngine(FuelType requiredFuelType){
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

    public int getFuelLevel(){
        return this.fuelLevel;
    }

    public abstract BigDecimal getProduceCost(int quantity);

}
