package WORK;
import java.util.Scanner;
public class Project extends Functions {

	public static void main(String[] args) {
		char CON = 0;                                                       //To repeat the process if required
		do{
			Layout();
			System.out.println("Do You Want to Continue?(Y/y)");
			CON = sc.next().charAt(0);
		}while((CON == 'Y')||(CON == 'y'));
		
	}

}
class Process
{
	static Scanner sc= new Scanner(System.in);
	public static void Call(int a)
	{	PS O = new PS();                             // Declaring objects of class PS, Hamming,levistien
		Hamming O1 = new Hamming();
		LEVISTIEN O2 = new LEVISTIEN();
		switch(a)                                    //Using switch case to move between menu
		{
		case 1:
			sc.nextLine();
			System.out.println("Enter a Paragraph:");
			String P1 = sc.nextLine();
			O.PTS(P1);
			break;
		case 2:
			sc.nextLine();
			System.out.println("Enter a Paragraph:");
			String P2 = sc.nextLine();
			O.FOW(P2);
			break;
		case 3:
			sc.nextLine();
			System.out.println("Enter Two words!");
			String W1 = sc.nextLine();
			String W2 = sc.nextLine();
			O1.HS(W1, W2);
			break;
		case 4:
			sc.nextLine();
			System.out.println("Enter Two words!");
			String W3 = sc.nextLine();
			String W4 = sc.nextLine();
			O2.DOA(W3, W4);
			break;
		default:
			System.exit(1);
			
			
		}
	}
}

class Functions extends Process{
	public static void Layout()
	{	
		System.out.println("	 		OOPS Project GROUP-8 		"              ///To display the menu in console and continue
			+"\n 1.Sentence Splitter"
			+"\n 2.Frequency of words"
			+"\n 3.Hamming"
			+"\n 4.Levinstien"
			+"\n 5.Exit"); 
		System.out.println("Enter Choice: ");
		int ch = sc.nextInt();
		
		Call(ch);
	}	
}
