package parser;

public class MessageParser {
	
	final String message;
	Parser parser;
	
	public MessageParser(final String message){
		this.message = message;
		parser = new Parser(message);
	}
	
	//Find the regexes
	
	//Involking the parser
}
