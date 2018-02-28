import java.util.Scanner;

public class PallendromeMain {

	public static void main(String[] args) {
		PallendromeApp app = new PallendromeApp();
		Scanner oScan = new Scanner(System.in);
		
		System.out.println("Enter word: ");
		String word = oScan.nextLine();
		if(app.Palledrome(word))
			System.out.println(word + " is a Pallendrome");
		else
			System.out.println(word + " is not a Pallendrome");

	}

}
