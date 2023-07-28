package WORK;

public class LEVISTIEN {
private int LEVENSHTEIN(String W1, String W2)          
{ char[] s1 = W1.toCharArray();
  char[] s2 = W2.toCharArray();                            //s1,s2 are char arrays of words W1,W2(input)

       
    int[] prev = new int[ s2.length + 1 ];                 

    for( int j = 0; j < s2.length + 1; j++ ) { 
        prev[ j ] = j;                                     //Initializing array prev with length of (W2+1) and intializing array elements as positions
    }

    for( int i = 1; i < s1.length  + 1; i++ ) {

         
        int[] curr = new int[ s2.length + 1 ];             //Initializing array curr with length of (W2+1)
        curr[0] = i;

        for( int j = 1; j < s2.length + 1; j++ ) {
            int d1 = prev[ j ] + 1;                        //Calculating the number of steps needed for deletion, insertion and addition.
            int d2 = curr[ j - 1 ] + 1;
            int d3 = prev[ j - 1 ];
            if ( s1[ i - 1 ] != s2[ j - 1 ] ) {             //Checking if the characters are same else incrementing d3.
                d3 += 1;
            }
            curr[ j ] = Math.min( Math.min( d1, d2 ), d3 ); //Finding the minimum number of changes required 
        }
   
        prev = curr;
    }
    
    return prev[ s2.length ];                               //Finding the final number of required changes
}
public void DOA(String W1, String W2)             
{	int doa  = LEVENSHTEIN(W1, W2);
	System.out.println("Number of changes: "+ doa);
	if(W1.length()>=W2.length())                            //Finding if characters are deleted or added
	{
		System.out.println("Number of deletion needed from '"+W1+"' is: " + doa);
	}else
		System.out.println("Number of addition needed in '"+W1+"' is: " + doa);
	}
}
