package service;

import model.User;

public class AstroCalculator {
	public String findSign(User astro) {
		String date=User.getDob();
		int day=Integer.parseInt(date);
		int month=Integer.parseInt(date);
		int year=Integer.parseInt(date);
		System.out.println(day);
		System.out.println(month);
		System.out.println(year);
		String astrosign = null;
	          
	    if (month == 1){ 
	        if (day < 20) 
	        astrosign= "Capricorn"; 
	        else
	        astrosign= "Aquarius"; 
	    } 
	          
	    else if (month == 2){ 
	        if (day < 19) 
	        	astrosign= "Aquarius"; 
	        else
	        	astrosign= "Pisces"; 
	    } 
	          
	    else if(month == 3){ 
	        if (day < 21)  
	        	astrosign = "Pisces"; 
	        else
	        	astrosign = "Aries"; 
	    } 
	    else if (month == 4){ 
	        if (day < 20) 
	        	astrosign = "Aries"; 
	        else
	        	astrosign = "Taurus"; 
	    } 
	          
	    else if (month == 5){ 
	        if (day < 21) 
	        	astrosign = "Taurus"; 
	        else
	        	astrosign = "Gemini"; 
	    } 
	          
	    else if( month == 6){ 
	        if (day < 21) 
	        	astrosign = "Gemini"; 
	        else
	        	astrosign = "Cancer"; 
	    } 
	          
	    else if (month == 7){ 
	        if (day < 23) 
	        	astrosign = "Cancer"; 
	        else
	        	astrosign = "Leo"; 
	    } 
	          
	    else if( month == 8){ 
	        if (day < 23)  
	        	astrosign = "Leo"; 
	        else
	        	astrosign = "Virgo"; 
	    } 
	          
	    else if (month == 9){ 
	        if (day < 23) 
	        	astrosign = "Virgo"; 
	        else
	        	astrosign = "Libra"; 
	    } 
	          
	    else if (month == 10){ 
	        if (day < 23) 
	        	astrosign = "Libra"; 
	        else
	        	astrosign = "Scorpio"; 
	    } 
	          
	    else if (month == 11){ 
	        if (day < 22) 
	        	astrosign = "Scorpio"; 
	        else
	        	astrosign = "Sagittarius"; 
	    } 
	    else  if (month == 12){ 
	        if (day < 22) 
	        	astrosign = "Sagittarius"; 
	        else
	        	astrosign ="Capricorn"; 
	    } 
		
		return astrosign;
			
	}

	
}