package com.hand;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		List<Integer> list = new ArrayList<Integer>();
		for(int i =0;i<50;i++) {
			list.add((int)Math.random()*100);
		}
		Map<Integer,Integer> m = new Hashtable<Integer,Integer>();
    }
}
