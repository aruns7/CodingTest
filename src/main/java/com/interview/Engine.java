package com.interview;

import java.math.BigDecimal;

/**
 * Created on 01/05/2016.
 */
public interface Engine {
        /**
         * starts engine
         */
        public void start();

        /**
         * stops engine
         */
        public void stop();

        /**
         * detects if engine is running
         *
         * @return
         */
        public boolean isRunning();

        /**
         * ills the engine
         *
         * @param fuelType  the fuel type to be filled
         * @param fuelLevel the fuel level
         */
        public void fill(FuelType fuelType, int fuelLevel);

        /**
         * Gets fuel type
         *
         * @return the fuel type
         */
        public FuelType getFuelType();

        /**
         * cost of producing widgets
         *
         * @param quantity the quantity to produce
         * @return the cost
         */
        public BigDecimal getProduceCost(int quantity);

        /**
         * gets fuel level
         *
         * @return the fuellevel
         */
        public int getFuelLevel();
    }

