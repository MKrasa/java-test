package main.java.pl.sii.eu;

import java.math.BigDecimal;
import java.math.RoundingMode;

import main.java.pl.sii.eu.model.Amount;
import main.java.pl.sii.eu.model.Currency;

public class Converter implements CurrencyConverter
{
    double EURO_TO_PLN_RATIO = 4.25181073;

    public Amount convertToPln(Amount euroAmount)
    {
    	long euroVal = euroAmount.getValue();
    	double conv = euroVal / EURO_TO_PLN_RATIO;
    	BigDecimal bd = new BigDecimal(Double.toString(conv));
    	bd = bd.setScale(euroAmount.PRECISION, RoundingMode.HALF_UP);
    	conv = bd.doubleValue();
    	conv = conv * 100;
    	long val = (long) conv;
    	Currency crr = Currency.PLN;
    	Amount am = new Amount(val, crr);
    	
    	return am;
    }

    public Amount convertToEur(Amount plnAmount)
    {
    	long plnVal = plnAmount.getValue();
    	double conv = plnVal * EURO_TO_PLN_RATIO;
    	BigDecimal bd = new BigDecimal(Double.toString(conv));
    	bd = bd.setScale(plnAmount.PRECISION, RoundingMode.HALF_UP);
    	conv = bd.doubleValue();
    	conv = conv * 100;
    	long val = (long) conv;
    	Currency crr = Currency.EUR;
    	Amount am = new Amount(val, crr);
    	
    	return am;
    }
    
}