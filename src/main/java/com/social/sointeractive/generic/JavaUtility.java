package com.social.sointeractive.generic;

import java.util.Random;

public class JavaUtility {

	/**
	 * This method is to convert String to int, long datatype
	 * @param s
	 * @return
	 */
	public long stringToInt(String s) {
		return Integer.parseInt(s);
	}
	
	/**
	 * this method is to generate Random number
	 * @param number
	 * @return
	 */
	public int getradomNo(int number)
	{
		Random radomnum=new Random();
	  return  radomnum.nextInt(number);
	}
}
