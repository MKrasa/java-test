package main.java.pl.sii.eu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Duplicate implements DuplicateChecker
{
	@Override
	public boolean hasDuplicateCharacters(String input)
	{
    	List<Integer>letters = new ArrayList<Integer>(32);
    	char[] tmp = input.toCharArray();
    	
    	for(int i = 0; i < input.length(); i++) 
    	{
    		letters.add((int)tmp[i]);
    	}
    	
    	letters.sort(Comparator.naturalOrder());
    	int act, prev;
    	boolean duplicate = false;
    	prev = letters.get(0);
    	
    	for(int i = 1; i < letters.size(); i++)
    	{
    		act = letters.get(i);
    		if(act == prev && act != 32)
    		{
    			duplicate = true;
    			break;
    		}
    		prev = act;
    	}
    	return duplicate;
	}
}
