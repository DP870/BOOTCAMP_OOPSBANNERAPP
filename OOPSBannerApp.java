/** 
* OOPSBANNERAPP UC4 - OOPS BANNER Display Application
*
* This class demonstrates a simple Java application that displays the OOPS logo using
* "*",String.join() and array.
*
*
<<<<<<< HEAD
* @author Developer
* @version 4
*/

public class OOPSBannerApp{
	public static void main (String[] args){
		String[] line=new String[7];
		line[0]= String.join("","   ***     ","   ***     ","  ****** ","  *****");
		
		line[1]=String.join(""," **   **   "," **    **  ","  **  ** ","  *   ");
		
		line[2]=String.join("","**      ** ","**      ** "," **  ** ","  *");
		
		line[3]=String.join("","**      ** ","**      ** ","  ****** ","  *****");
		
		line[4]=String.join("","**      ** ","**      ** ","  **     ","      * ");
		
		line[5]=String.join(""," **   **   ","**    **   ","  **     ","      *");
		
		line[6]=String.join("","   ***     ","   ***     ","  **     ","  *****");
		
		
		
		for (String pattern:line){
				System.out.println(pattern);
		}

	
	}
}


