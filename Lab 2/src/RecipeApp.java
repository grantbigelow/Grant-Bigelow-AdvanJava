/*
 * Programmer: Grant Bigelow
 * Date: 1/28/18
 * Description: App recipe class that has methods that format
 * the ingredients and steps as a string. 
 */

public class RecipeApp  {
	
	public String sIngredient(String ingred) {
		return ("* "+ingred);
	}
	public String sStep(int num, String step) {
		return (num+". "+step);
	}

}
