package Reverse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Testing 
{
	ReverseOfLastTwoCharacters string =new ReverseOfLastTwoCharacters();
	
	/*
	 *  Case 1: "AB" => "BA"
	 *  Case 2: "RAIN" => "RANI"
	 *  Case 3: "A" => "A"
	 *  Case 4: "" => ""
	 */
	
	@Test
	void testWithTwoCharacters() 
	{
		assertEquals("BA",string.Reverse("AB"),"Execution success");
	}
	
	@Test
	void testWithMultipleCharacters() 
	{
		assertEquals("RANI",string.Reverse("RAIN"),"Execution success");
	}
	
	@Test
	void testWithOneCharacter() 
	{
		assertEquals("A",string.Reverse("A"),"Execution success");
	}
	
	@Test
	void testWithNoCharacter() 
	{
		assertEquals("",string.Reverse(""),"Execution success");
	}

}
