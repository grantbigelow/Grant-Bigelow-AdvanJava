import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 2/19/18
 * Description: allows the user to input a sentence 
 * and uses the SecureApp app to tell the user if their input
 * is sanitary or not.  
 */
public class SecureMain {

	public static void main(String[] args) {
		SecureApp app = new SecureApp();
		Scanner oScan = new Scanner(System.in);
		System.out.println("Enter a Sentence: ");
		System.out.println(app.secureCheck(oScan.nextLine()));
		

	}

}
