package enumerates;

	
	
	// A Java program to demonstrate working on enum
	// in switch case (Filename Test. Java)
	import java.util.Scanner;
	  
	// An Enum class
	enum Month
	{
	    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE,
	    JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER;
	}
	  
	// Driver class that contains an object of "day" and
	// main().

public class ExampleEnumMonthOfTheYear {
	
	    private Month month;
	  
	    // Constructor
	    public ExampleEnumMonthOfTheYear(Month month)
	    {
	        this.month = month;
	    }
	  
	    // Prints a line about Day using switch
	    public void dayIsLike()
	    {
	        switch (month)
	        {
	        case DECEMBER,JANUARY,FEBRUARY:
	            System.out.println("Cold, sometimes windy, others snowy");
	            break;
	        case MARCH, APRIL, MAY:
	            System.out.println("Spring is here, weather betters");
	            break;
	        case JUNE, JULY, AUGUST:
	        	
	        	System.out.println("Summer time, have a break and enjoy the weather, hot and humid");
            break;
	        case SEPTEMBER, OCTOBER, NOVEMBER:
	            System.out.println("Good weather, enjoy outside activities until november take over");
	            break;
	        default:
	            System.out.println("Did you forget one month?");
	            break;
	        }
	    }
	  
	    // Driver method
	    public static void main(String[] args)
	    {
	        String str = "JUNE";
	        ExampleEnumMonthOfTheYear t1 = new ExampleEnumMonthOfTheYear(Month.valueOf(str));
	        t1.dayIsLike();
	    }
	}

