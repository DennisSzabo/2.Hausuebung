/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.hausübung;

/**
 *
 * @author szabo
 */
public class RationalCalculator extends AbstractCalculator
{

    public RationalCalculator(CalculationOperation add, CalculationOperation subtract, CalculationOperation multiply, CalculationOperation divide) {
        super(add, subtract, multiply, divide);
    }

    @Override
    public Number add(Number a, Number b) 
    {
        return this.add.calc(a, b);
    }

    @Override
    public Number subtract(Number a, Number b) 
    {
        return this.add.calc(a, b);
    }

    @Override
    public Number multiply(Number a, Number b) 
    {
        return this.add.calc(a, b);
    }

    @Override
    public Number divide(Number a, Number b) 
    {
        return this.add.calc(a, b);
    }
    
}
