package main.java.pl.sii.eu;

public class Upper implements UpperCaseChecker
{
	@Override
	public boolean hasUpperCaseLetters(String input)
	{
    	boolean upper = false;
    	char[] tmp = input.toCharArray();
    	for(int i = 0; i < input.length(); i++)
    	{
    		if( (int)tmp[i] >= 65 && (int)tmp[i] <= 90)
    		{
    			upper = true;
    			break;
    		}
    		else
    		{
    			upper = false;
    		}
    	}
    	return upper;
	}
}