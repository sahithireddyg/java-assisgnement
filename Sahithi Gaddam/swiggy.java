import java.util.*;

class NonDeliverableException extends Exception           //custom exception
 {
	 NonDeliverableException(int z)                           //constructor
	 {
		 int e=z;
	 }     
 }

class swiggy
{
	static void zipcode(int z) throws NonDeliverableException
     {
				if (z==123||z==456||z==789)
				{
					 throw new NonDeliverableException(z);               //exception is thrown
				}
			    else
				System.out.println("Delivery available in your area");

	 }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter zip code:");
		int z=sc.nextInt();
			try{
				zipcode(z);
			}
			catch(NonDeliverableException e)                               //exception caught
		      {
		        System.out.println("Delivery is unavailable in your area");
		      }
		
	}
}
