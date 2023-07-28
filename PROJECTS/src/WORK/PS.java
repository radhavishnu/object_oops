package WORK;

public class PS {
private int NOS = 0, NOW = 0;                                 //Initializing the number of sentences(NOS), Number of words(NOW) as 0

public void PTS(String Para)
{ 	NOSAW(Para);                                              //Function for Finding the number of sentences and words
	int e = 0;
	int nolps[] = new int[NOS];                               //No of letters per sentence(nolps) whose length is the number of sentences 
	for(int j = 0; j<NOS; j++)                                //For reading all the sentences.
	{   int a = 0;
		while(Para.charAt(e) != '.')                          //For reading all the letters of each sentence and hence finding the nolps of each sentence till '.' is encountered
		{ 
			a += 1;
			++e;
		}
		a +=1;
		nolps[j] = a;                                         //Storing the value of nolps
		++e;
	}
	String nos[] = new String[NOS];                           //Array of Strings to store the sentences
	int q = 0;
	for(int j = 0;j<NOS;j++)                                  //For reading each sentence
	{
		char sentence[] = new char[nolps[j]];                 //Creating char array for storing individual sentences whose length is the nolps of that sentence
		for(int i = 0; (i) < (nolps[j]);i++)
		{
			sentence[i] = Para.charAt(q+i);                   //Copying the characters of the sentence into the temporary array(sentence)
		}
		nos[j] = toString(sentence);                          //Converting the array to a string and copying it to the array of sentences
		q += nolps[j];                                        //Changing the value of q such that next sentence is read.
	}
		int no = 1;                                           //no is the Sentence number
		System.out.print("Sentence " + no +" :");
	for(int j = 1; j<= nos.length;j++)
		{                                                    //if statement for checking the condition of Name with initial(Capital or Small(as the previous character is also space)) 
		if(((nos[j - 1].charAt(nos[j-1].length() - 2) >= 65) && (nos[j - 1].charAt(nos[j-1].length() - 2 ) <= 90)) || ((nos[j - 1].charAt(nos[j-1].length() - 2) >= 95) && (nos[j - 1].charAt(nos[j-1].length() - 2 ) <= 122)) && (nos[j - 1].charAt(nos[j-1].length() - 3)==' ') )
		{System.out.print(nos[j-1]);
		continue;}                                            
		else
		System.out.println(nos[j-1]);
		++no;
		if(j!= nos.length)
		System.out.print("Sentence " + no +" :");           //Printing the sentences according to the condition that if the name is encountered and don't print until the whole sentence is completed
	}
	
}
private String[] STW(String Para)                           //Function for converting Sentences to Words
{ 	NOSAW(Para);                                            //Function for Finding the number of sentences and words
	int e = 0;
	int nolpw[] = new int[NOW];                             //No of letters per words(nolpw) whose length is the number of words
	for(int j = 0; j<NOW; j++)                              //For loop for finding length
	{   int a = 0;                                          //a is the temporary nolpw                                                                 
		while(e<Para.length())
		{
			if(Para.charAt(e) == ' ' || (Para.charAt(e) == '.'))//if statement for checking if ' ' or '.' is encountered which signals a word ends 
			{a+=1;                          
			e++;
			break;
			}
			a+=1;
			++e;
		}
		nolpw[j] = a;                                       //Initializing the nolpw of each word
	}	
	String now[] = new String[NOW];                         //now is the array of strings of words
	int q = 0;
	for(int j = 0;j<NOW;j++)
	{	
		char word[] = new char[nolpw[j]];                   //Char array contaning the temporary words
		for(int i = 0; (i) < (nolpw[j]-1);i++)
		{	if(((Para.charAt(q + i)>=65) && (Para.charAt(q + i)<=90)) || ((Para.charAt(q + i)>=97) && (Para.charAt(q + i)<=122)))
			{word[i] = Para.charAt(q + i);}                //Copying character of each word to the temporary array
			else
			word[i] = ' ';
		}
		String str = toString(word);                        //Copying the word into the word array as string
		str = str.replaceAll(" ","");
		now[j] = str.toLowerCase();
		q += nolpw[j]; 
	}
	return now;
	
}
private String toString(char[] a)                           //Returns the String
{ 
    String string = new String(a); 
    return string; 
} 
private void NOSAW(String Para)                            //Function for Finding the number of sentences and words
{ 	
	for(int j = 0;j<Para.length();j++)
    {
	if(Para.charAt(j) == '.')
		NOS += 1;
	if(Para.charAt(j) == '.' || Para.charAt(j) == ' ')
		NOW += 1;
	}
}

public void FOW(String W)                                  //Function for finding frequency of words
{	String words[] = STW(W);                               //Splitting into words
	int count=1;
    
    for(int i=0;i<words.length;i++)                        //Reading the word array 
    {
        for(int j=i+1;j<words.length;j++)
        {
          if(words[i].equals(words[j]) && words[i]!="-1")  //Checking if the word already exists 
            {
                 words[j]="-1";                            //if it already exists making the string '-1' and incrementing count
                count++; 
            }
        }
        

        if(count>=1 && words[i]!="-1")
        {
            System.out.println(words[i]+" "+count);        //Printing the words
             words[i]="-1";
        }
        count=1;
    }
	}
}