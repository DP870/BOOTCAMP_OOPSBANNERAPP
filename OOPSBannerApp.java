/** 
* OOPSBANNERAPP UC7 - OOPS BANNER Display Application
*
* This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate
* character-to-pattern mappings. The application retrieves and displays the "OOPS"
* banner using these mappings.
*
*
* @author Dhruv
* @version 7.0
*/

public class OOPSBannerApp{

	static class CharacterPatternMap {
		Character character;
		String[] pattern;
		
		public static String[] getOPattern(){
			return new String[]{
				"    ***     ",
				"  **   **   ",
				" **     **  ",
				" **     **  ",
				" **    **   ",
				" **    **   ",
				"    ***     "
				
			};
		}
		
		public static String[] getPPattern(){
			return new String[]{
				" ****** ",
				" **  ** ",
				" **  ** ",
				" ****** ",
				" **     ",
				" **     ",
				" **     "
			};
	}

		public static String[] getSPattern(){
			return new String[]{
				" *****",
				" *",
				" *",
				" *****",
				"     *",
				"     *",
				" *****"
			};
	}
		
		}

	


	

	public static void main (String[] args){
		CharacterPatternMap pattern=new CharacterPatternMap();
		String[] O=pattern.getOPattern();
		String[] P=pattern.getPPattern();
		String[] S=pattern.getSPattern();
		for (int i=0;i<O.length;i++){
				System.out.println(O[i]+O[i]+P[i]+S[i]);
		}
}
}

