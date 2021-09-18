package emppresent;

public class fulltime {
       public static void main(String[] args) {
    	   int IS_FULL_TIME=1;
    	   int EMP_RATE_HOUR=20;
    	   int hour=0;
    	   int wage=0;
    	   double empcheck = Math.floor(Math.random() * 10) % 2;
    	      if(empcheck == IS_FULL_TIME)
    	    	  hour = 8;
    	      else
    	    	  hour = 0;
    	   wage= hour * EMP_RATE_HOUR;
    	   System.out.println(" wage :" + wage);
    			   
       }
}

