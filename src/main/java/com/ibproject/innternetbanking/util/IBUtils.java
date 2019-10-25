package com.ibproject.innternetbanking.util;

public class IBUtils {
	
	public static Integer generateOTP(){		
	    return new Integer((int) (Math.round(Math.random() * 89999) + 10000));		
	}
	
}
