/** 
* OOPSBANNERAPP UC5 - OOPS BANNER Display Application
*
* This class demonstrates a simple Java application that displays the OOPS logo stored in an
* array and uses a for loop for printing the pattern.
*
*
<<<<<<< HEAD
* @author Developer
* @version 5.0
*/

public class OOPSBannerApp{
	public static void main (String[] args){
		String[] lines={"   ***        ***      ******   *****",
						" **   **    **   **    **  **   *   ",
						"**      ** **     **   **  **   *",
						"**      ** **     **   ******   *****",
						"**      ** **     **   **           * ",
						" **   **   **     **   **           *",
						"   ***        ***      **       *****"
						};
			
		
		for (String pattern:lines){
				System.out.println(pattern);
		}

	
	}
}


