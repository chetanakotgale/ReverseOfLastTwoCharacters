package Reverse;

public class ReverseOfLastTwoCharacters 
{
	public String Reverse(String string)
	{
		String result = "";
		int length = string.length();		//Length of String 
		
		if(length<2)
		{
			result = result+string;				//Condition for Strings having length 1 and 2
		}
		else
		{
			char last = string.charAt(length-1);		//Last character of string
			char lastButOne = string.charAt(length-2);	//Last But One character of String
			
			result = result+string.substring(0,length-2)+last+lastButOne;
		}
		return result;
	}

}
