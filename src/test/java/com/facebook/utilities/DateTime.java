package com.facebook.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTime {
	public static String getSystemDate()
	{
	
		DateFormat df = new SimpleDateFormat("MM-dd-yy_HH.mm.ss"); 
		Date dateobj = new Date();
	
		String systemDate = df.format(dateobj);
		
		return systemDate;
	}

}
