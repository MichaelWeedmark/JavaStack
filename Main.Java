/******************************************************************************
 * 
 * Made by Michael Weedmark
 * Made on 2016-09-30
 * This program Uses Stacks
 * 
******************************************************************************/

public class Main {

	public static void main(String[] args){
		
		MrCoxallStack aSingleStack = new MrCoxallStack();
		
		String ThingToPutInStack = "a";
		String ThingToPutInStack1 = "b";
		
		try {
			
			aSingleStack.push(ThingToPutInStack);
			aSingleStack.push(ThingToPutInStack1);
			
		} finally {
			
			aSingleStack.pop(ThingToPutInStack);
			
		}
		
	}
	
}
