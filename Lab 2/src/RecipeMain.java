import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/*
 * Programmer: Grant Bigelow
 * Date: 1/28/18
 * Description: Main recipe class that allows the user
 * to enter in the recipe name, ingredients, and steps involved 
 * and creates a text file with the information entered. 
 */
public class RecipeMain {

	public static void main(String[] args) throws IOException {
		String sName = "";
		String input = "";
		int count = 0;
		boolean bDone = true;
		RecipeApp app = new RecipeApp();
		Scanner oScan = new Scanner(System.in);
		System.out.println("Enter the recipe name: ");
		sName = oScan.nextLine();
		String sFile = ("C:\\Users\\grant\\eclipse-workspace\\Lab 2\\"+sName+".txt");
		FileWriter fw = new FileWriter(sFile);
		fw.write("\t\t\t" + sName);
		fw.write('\r');
		fw.write('\n');
		fw.write('\r');
		fw.write('\n');
		
		fw.write("Ingredients");
		fw.write('\r');
		fw.write('\n');
		while(bDone) {
			System.out.println("Enter Ingredient or hit enter when complete: ");
			input = oScan.nextLine();
			if(input.equals("")) {
				bDone = false;
				break;
			}
			input = app.sIngredient(input);
			fw.write(input);
			fw.write('\r');
			fw.write('\n');
			
		}
		bDone = true;
		fw.write('\r');
		fw.write("\n\n");
		fw.write("Steps");
		fw.write('\r');
		fw.write('\n');
		while(bDone) {
			System.out.println("Enter recipe step or hit enter when done: ");
			input = oScan.nextLine();
			if(input.equals("")) {
				bDone = false;
				break;
			}
			count++;
			input = app.sStep(count,input);
			fw.write(input);
			fw.write('\r');
			fw.write('\n');
			
		}
		fw.close();
		
	}

}
