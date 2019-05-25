package com.nt.beans;

import java.util.Date;

public class WishGenerator {
	private Date date;

	public void setDate(Date dt) {
		this.date = dt;
	}
	
	

    //Busiess logic
    public String generateMsg(String user)
    {
    	//B.logic
         int hour=date.getHours();
         if(hour<=12)
        	 return "GOOD MORNING "+user;
         else
        	 if(hour<=17)
        		 return "Good Afternoon " +user;
        	 else
        		 return "Good Evening " +user;
    }//method()

}
