import java.util.Scanner;

	public class Table
	{
	    public static void main(String[] args)
	    {
	    	  Scanner console = new Scanner(System.in);
	    	   int num,i = 1;
               
               int num2 = 1;	        

	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	        while(num2 != (num*10)){            
	        System.out.println("Multiplication Table of " + num*i);
	        
               num2 = num * i;
	       //TODO implement While loop to get print result

                i++;
                }
	    }
}
	


	