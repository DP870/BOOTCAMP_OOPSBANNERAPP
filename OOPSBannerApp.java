/** 
* OOPSBANNERAPP UC6 - OOPS BANNER Display Application
*
* This class demonstrates a Java application that displays the OOPS logo using "*".
* The code makes use of different methods for each characters to do the same.
*
*
<<<<<<< HEAD
* @author Developer
* @version 6.0
*/

public class OOPSBannerApp{
	
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
				" **",
				" **",
				" *****",
				"    **",
				"    **",
				" *****"
			};
	}
	public static void main (String[] args){
		String[] O=getOPattern();
		String[] P=getPPattern();
		String[] S=getSPattern();
		for (int i=0;i<O.length;i++){
			System.out.println(O[i]+O[i]+P[i]+S[i]);
		}
		
		
	}
	
	
}


