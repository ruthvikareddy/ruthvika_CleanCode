package com.ruthvika.epamtask;
import java.util.Scanner;
import java.util.logging.Logger;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		boolean b = true;
		Logger logger = Logger.getLogger(App.class.getName());
		logger.info("Enter the total area of house(in feets):");
		int area = sc.nextInt();
		logger.info("Select the material standard from the below list");
		logger.info("1.Standard Material");
		logger.info("2.Above Standard Material");
		logger.info("3.High Standard Material");
		logger.info("4.High Standard Material and Fully Automated House");
		char materialtype = sc.next().charAt(0);;
		int result;
		Construction totalcost = new Construction();
		switch(materialtype) {
				case '1':
					result = totalcost.stdmat(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				case '2':
					result = totalcost.abovestdmat(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				case '3':
					result = totalcost.highstdmat(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				case '4':
					result = totalcost.fullyaut(area);
					logger.info("The cost of the house would be: Rs." +result);
					break;
				default:						
					break;		
		}	
    }
}