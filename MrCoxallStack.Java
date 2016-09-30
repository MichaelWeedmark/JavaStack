/******************************************************************************
 * 
 * Made by Michael Weedmark
 * Made on 2016-09-30
 * This is the stack the stub program uses
 * 
******************************************************************************/

import java.util.ArrayList;
import java.util.List;

public class MrCoxallStack {
    	
    private List _anArray = new ArrayList();
        
    public void push(String PutOn) {
        	
        	_anArray.add(PutOn);
        	System.out.println(_anArray);
        	
    }
    	
    public void pop(String TakeOff) {
        	
        	_anArray.remove(TakeOff);
        	System.out.println(_anArray);
    }

	
}
