import java.util.Scanner;

public class Exercise3 
{

    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);
      
      //Number 1
      
      int seconds,secs,min,hour,time;
     
      
      //Input
      
      System.out.println("Enter time in seconds: ");
      seconds = input.nextInt();
      
      //Assigning
      min = (seconds%3600)/60;
      hour = seconds/3600;
      secs = seconds%60;
      
     //Display
     
     System.out.println("time " + hour + " hour " + min+ " minutes " + secs + " seconds ");
      
      
      
     //Number 2 
      
      double distance,miles,price,cost;
      
        System.out.println("Enter the driving distance: ");
        distance = input.nextDouble();
        System.out.println("Enter miles per gallon: ");
        miles = input.nextDouble();
        System.out.println("Enter price per gallon: ");
        price = input.nextDouble();
        
        //assigning
        
        cost = (distance / miles ) * price;
        
        //display
        
        System.out.printf("The cost of driving is $ %.2f", cost);
        
      
    }
    
}
