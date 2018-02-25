/*
 * Programmer: Grant Bigelow
 * Date: 2/19/18
 * Description: Checks whether or not a string is sanitary and prints
 * unsafe or safe based on whether it is sanitary. 
 */
public class SecureApp {
	public String secureCheck(String n) {
		String check = "";
		int quote = 0;
		int paren = 0;
		int apos = 0;
		int sql = 0;
		int hex = 0;
		String sHex="";
		String words[] = n.split(" ");
		for (int i = 0; i < n.length(); i++){
			
		    char c = n.charAt(i); 
		    
		    if(c=='"' )
		    	quote++;
		    if(c=='(')
		    	paren++;
		    if(c==')')
		    	paren++;
		    if(c=='\'' )
		    	apos++;
		   
		    if(c=='0'&& i < n.length()-2&& ! Character.isDigit(n.charAt(i-1))) {
		    	hex = i;
		    	if(n.charAt(hex+1)=='x'||Character.isDigit(n.charAt(hex+1))&&Character.isDigit(n.charAt(hex+2)))
		    		sHex = "hex";
		    }
		    	
		    	
		}
		char last = n.charAt(n.length()-1);
		
		for (int j = 0; j < words.length; j++){
			String sqlCheck = (words[j].toString()).toUpperCase();
			if(sqlCheck.equals("SELECT"))
				sql++;
				
				
			if(sqlCheck.equals("WHERE"))
				sql++;
		
				
		}
		
		if(quote == 2 || quote == 0 && paren == 2 || paren == 0 && sql <= 1)
			check = "Safe";
		else
			check = "Unsafe";
		if(last==';')
			check = "Unsafe";
		if(sHex.equals("hex"))
			check = "Unsafe";
		if(apos == 1 && quote == 0)
			check = "Unsafe";
		
		
		return check;
	}
	
}