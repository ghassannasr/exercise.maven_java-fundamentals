package com.github.perscholas.java_fundamentals;

/**
 * Created by Leon Hunter on 6/14/17.
 */
public class MathUtilities {

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Integer add(int baseValue, int difference) {

        return baseValue + difference;
    }
    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Long add(long baseValue, long difference) {

        return baseValue + difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Short add(short baseValue, short difference) {
        final int i = baseValue + difference;
        Integer integerResult = i;
        if(integerResult <= Short.MAX_VALUE) return i;
        else {
            return integerResult;
        }
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Integer add(byte baseValue, byte difference) {

        Integer integerResult = baseValue + difference;
        if(integerResult <= Byte.MAX_VALUE) {
            return baseValue + difference;
        }
        else {
            return integerResult;
        }
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Float add(float baseValue, float difference) {

        return baseValue + difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to add to starting value
     * @return sum of `baseValue` and `difference`
     */
    public Double add(double baseValue, double difference) {

        return baseValue + difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(int baseValue, int difference) {

        return baseValue - difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Long subtract(long baseValue, long difference) {

        return baseValue - difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(short baseValue, short difference) {

        Integer integerResult = baseValue - difference;
        if(integerResult <= Short.MAX_VALUE) {
            return baseValue - difference;
        }
        else {
            return integerResult;
        }
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Integer subtract(byte baseValue, byte difference) {

        Integer integerResult = baseValue - difference;
        if(integerResult <= Byte.MAX_VALUE) {
            return baseValue - difference;
        }
        else {
            return integerResult;
        }
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Float subtract(float baseValue, float difference) {

        return baseValue - difference;
    }

    /**
     * @param baseValue  starting value
     * @param difference value to subtract from starting value
     * @return difference between `baseValue` and `difference`
     */
    public Double subtract(double baseValue, double difference) {

        return baseValue - difference;
    }


    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divide(int dividend, int divisor) {

        return dividend / divisor;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Long divide(long dividend, long divisor) {

        return dividend / divisor;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divide(short dividend, short divisor) {

        Integer integerResult = dividend / divisor;
        if(integerResult <= Short.MAX_VALUE) {
            return dividend / divisor;
        }
        else {
            return integerResult;
        }
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Integer divide(byte dividend, byte divisor) {

        Integer integerResult = dividend / divisor;
        if(integerResult <= Byte.MAX_VALUE) {
            return dividend / divisor;
        }
        else {
            return integerResult;
        }
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Float divide(float dividend, float divisor) {

        return dividend / divisor;
    }

    /**
     * @param dividend value to be divided
     * @param divisor value to divide by
     * @return division of `dividend` by `divisor
     */
    public Double divide(double dividend, double divisor) {

        return dividend / divisor;
    }


    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(int multiplicand, int multiplier) {

        return multiplicand * multiplier;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Long multiply(long multiplicand, long multiplier) {

        return multiplicand * multiplier;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(short multiplicand, short multiplier) {

        Integer integerResult = multiplicand * multiplier;
        if(integerResult <= Short.MAX_VALUE) {
            return multiplicand / multiplier;
        }
        else {
            return integerResult;
        }
    }
    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Integer multiply(byte multiplicand, byte multiplier) {

        Integer integerResult = multiplicand * multiplier;
        if(integerResult <= Byte.MAX_VALUE) {
            return multiplicand / multiplier;
        }
        else {
            return integerResult;
        }
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Float multiply(float multiplicand, float multiplier) {

        return multiplicand * multiplier;
    }

    /**
     * @param multiplicand value to be multiplied
     * @param multiplier value to multiply by
     * @return product of `multiplicand` by `multiplier`
     */
    public Double multiply(double multiplicand, double multiplier) {

        return multiplicand * multiplier;
    }
}

