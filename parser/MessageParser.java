package parser;

public class MessageParser {
	
	final String message;
	Parser parser;
	String URI,comment,personComment;
	
	public MessageParser(final String message){
		this.message = message;
		parser = new Parser(message);
	}
	
	public void validate(){
		if (message.length() > 140){
			System.out.println("The message is bigger then the maximum length");
		}
		else{
			parser.getURI();
			parser.getComment();
			parser.getPersonComment();
		}
	}
	//Find the regexes

	public String getURI() {
		
		return null;
	}

	public String getComment() {
		
		return null;
	}

	public String getPersonComment() {
		
		return null;
	}

	//Involking the parser
}
