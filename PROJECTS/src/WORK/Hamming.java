package WORK;

public class Hamming 
{
	private int HammingString(String a, String b)                               //String a and b are the inputs
	{ int C = 0;                                                                //C is the hamming distance, intially declared 0
		if(a.length() != b.length())                                            //Checking if String length are equal
		 System.out.println("String length not equal!");
		else {
			for(int j = 0; j<a.length(); j++)                                   //For loop for getting the position
	 		{
				if(a.charAt(j) != b.charAt(j))                                  //Comparing the characters and incrementing C if not equal
					C += 1;
			}
		}
		return C;
	}
	public void HS(String W1, String W2)                                       //Function for Calling HammingString 
	{
		int a = HammingString(W1,W2);
		System.out.println("Hamming Length of '"+W1+"' and '"+W2+"' is: "+ a);
	}
}
