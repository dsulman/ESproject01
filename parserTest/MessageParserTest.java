package parserTest;

import static org.junit.Assert.*;

import org.junit.*;

import parser.MessageParser;

public class MessageParserTest {
	
	MessageParser messageParser = new MessageParser("@franky goes to #hollywood. See http://cnn.com. Your message parser must be able to support interfaces");
	
	@Test
	public void testValidate(){
		assertEquals(true, messageParser.validate());
	}
	
	@Test
	public void getURITest(){
		assertEquals("http://cnn.com",messageParser.getURI());
	}
	
	@Test
	public void getCommentTest(){
		assertEquals("#hollywood",messageParser.getComment());
	}
	
	@Test
	public void getPersonComentTest(){
		assertEquals("@franky",messageParser.getPersonComment());
	}
	
}
