package parserTest;

import static org.junit.Assert.assertEquals;

import org.junit.*;

import parser.Parser;

public class ParserTest {
	
	Parser parser = new Parser("@franky goes to #hollywood. See http://cnn.com. Your message parser must be able to support interfaces");
	
	
	@Test
	public void getURITest(){
		assertEquals("http://cnn.com",parser.getURI());
	}
	
	@Test
	public void getCommentTest(){
		assertEquals("#hollywood",parser.getComment());
	}
	
	@Test
	public void getPersonComentTest(){
		assertEquals("@franky",parser.getPersonComment());
	}
	
}
