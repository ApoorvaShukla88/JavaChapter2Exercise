package JUNIT;
import org.junit.Test;

import junit.framework.Assert;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.Before;



public class TweetTest {
	
	Tweet tweet;
	@Before
	public void setup(){
		tweet = new Tweet();	
	}
	

	@Test
	public void limitTest(){
		tweet.addLetter('z');
		Assert.assertEquals("z",tweet.getMessage());
	}
	
	 

}
