package parser;

public class MessageReceiver {
	
	final String message;
	String URI;
	String comment;
	String personComment;
	
	public MessageReceiver(final String message){
		this.message = message;
		this.URI = null;
		this.comment = null;
		this.personComment = null;
	}
	
	//This method will validate the tweet and extract the regex (expressions)
	public void getParameters(){
		
		MessageParser messageParser = new MessageParser(message);
		URI = messageParser.getURI();
		comment = messageParser.getComment();
		personComment = messageParser.getPersonComment();
		
	}
}
