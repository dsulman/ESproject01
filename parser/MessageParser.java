package parser;

public class MessageParser {
	
	final String message;
	Parser parser;
	String URI,comment,personComment;
	
	public MessageParser(final String message){
		this.message = message;
		parser = new Parser(message);
	}
	
	//Check the length of the tweet and if it is equal or less then 140 chars it gets the URI, comment and person comment
	
	public void validate(){
		if (message.length() > 140){
			System.out.println("The message is bigger then the maximum length");
		}
		else{
			URI = parser.getURI();
			comment = parser.getComment();
			personComment =parser.getPersonComment();
		}
	}

	public String getURI() {
		
		return URI;
	}

	public String getComment() {
		
		return comment;
	}

	public String getPersonComment() {
		
		return personComment;
	}

	
}
