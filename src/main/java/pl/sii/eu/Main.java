package main.java.pl.sii.eu;

import main.java.pl.sii.eu.model.Amount;
import main.java.pl.sii.eu.model.Currency;

public class Main
{
	public static void main(String[] args)
	{
		String test = "Ala ma kota";
		boolean isUp, isDp;
		Amount tmp = new Amount(0, null);
		Amount eur = new Amount(10, Currency.EUR);
		Amount pln = new Amount(10, Currency.PLN);
		
		UpperCaseChecker up = new Upper();
		DuplicateChecker dp = new Duplicate();
		CurrencyConverter cc = new Converter();
		
		isUp = up.hasUpperCaseLetters(test);
		isDp = dp.hasDuplicateCharacters(test);
		
		System.out.println("Upp: " + isUp);
		System.out.println("Dupl: " + isDp);
		
		tmp = cc.convertToPln(eur);		
		System.out.println("Pln -> Eur: " + (double)tmp.getValue() / 100);
		
		tmp = cc.convertToEur(pln);
		System.out.println("Eur -> Pln: " + (double)tmp.getValue() / 100);
	}
}