
public class PallendromeApp {
	public boolean Palledrome(String word) {
		String halfWordTwo = "";
		
		
		char[] array= word.toCharArray();
		int beginWord = 0;
		int endWord = array.length-1;
		char letter; 
		
		while(endWord>beginWord) {
			if(array[beginWord].equals(" "))
				beginWord++;
				
			letter = array[beginWord];
			array[beginWord]=array[endWord];
			array[endWord]=letter;
			endWord--;
			beginWord++;
		}
		halfWordTwo = new String(array);
		if(word.equals(halfWordTwo))
			return true;
		else
			return false;
			
	}
}
