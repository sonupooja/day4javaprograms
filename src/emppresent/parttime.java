package emppresent;

public class parttime {
   public static void main(String[] args) {
	   int IS_PART_TIME=1;
	   int IS_FULL_TIME=2;
	   int EMP_RATE_PER_HOUR=20;
	   int emphour=0;
	   int empwage=0;
	   double empcheck = Math.floor(Math.random() * 10) % 3;
	    if(empcheck == IS_PART_TIME)
	    	emphour=4;
	    else if(empcheck == IS_FULL_TIME)
	    	emphour=8;
	    else
	    	emphour=0;
	    empwage = emphour * EMP_RATE_PER_HOUR;
	    System.out.println("empwage : " + empwage);
   }
}











