package com.br.utils.commons;

import java.text.ParseException;
import java.text.SimpleDateFormat;


public class MyUtil {
	
	public static java.sql.Date ToSQLDate(java.util.Date mydate){
		long time = mydate.getTime();
		java.sql.Date sqldate=new java.sql.Date(time);
		return sqldate;
	}
	
	public static java.util.Date ToUtilDate(String mydate){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date udate=null;
		try {
			udate = sdf.parse(mydate);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return udate;
	}
	
	public static java.sql.Date ToSQLDate(String mydate){
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		long time =-1;
		try {
			java.util.Date udate = sdf.parse(mydate);
			time = udate.getTime();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		java.sql.Date sqldate=new java.sql.Date(time);
		return sqldate;
	}
	
	

}

