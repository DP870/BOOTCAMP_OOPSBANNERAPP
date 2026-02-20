/** 
* OOPSBANNERAPP UC8 - OOPS BANNER Display Application
*
* This use case extends UC7 by implementing a CharacterPatternMap class to encapsulate
* character-to-pattern mappings. The application retrieves and displays the "OOPS"
* banner using these mappings.
*
*
* @author Dhruv
* @version 8.0
*/
import java.util.HashMap;

public class OOPSBannerApp{
	
	//Hash Map Creation
	public static HashMap<Character,String[]> createCharacterMap(){
		
		HashMap<Character,String[]> charMap=new HashMap<>();   //Storing Key-Value Pair in HashMap
		String[] o_pattern = {
				"    ***     ",
				"  **   **   ",
				" **     **  ",
				" **     **  ",
				" **     **  ",
				" **    **   ",
				"    ***     "			
		};
		charMap.put('O',o_pattern);
		
		String[] p_pattern={
			" ****** ",
				" **  ** ",
				" **  ** ",
				" ****** ",
				" **     ",
				" **     ",
				" **     "			
		};
		charMap.put('P',p_pattern);
		
		String[] s_pattern={
				" *****",
				" *",
				" *",
				" *****",
				"     *",
				"     *",
				" *****"	
		};
		charMap.put('S',s_pattern);
		
		
		return charMap;
		
	}
	
	//Method to Print the Pattern
	public static void displayBanner(String message,HashMap<Character, String[]> charMap){
		int patternHeight=charMap.get('O').length;
		
		
		for (int line=0;line<patternHeight;line++){
			System.out.println(charMap.get('O')[line]+charMap.get('O')[line]+charMap.get('P')[line]+charMap.get('S')[line]);		
		}
		
		
		
	}
	
	
	//Main Method
	public static void main (String[] args){
		HashMap<Character,String[]> charMap=createCharacterMap();
		String message="OOPS";
		displayBanner(message, charMap);
}
}

