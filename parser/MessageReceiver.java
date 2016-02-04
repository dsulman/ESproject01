package parser;

public class MessageReceiver {
	
	final String message;
	final String URI;
	final String comment;
	final String personComment;
	
	public MessageReceiver(final String message){
		this.message = message;
		this.URI = null;
		this.comment = null;
		this.personComment = null;
	}
	
	public void validate(){
		//Max length of the tweet
		if (message.length() > 140){
			System.out.println("The message is bigger then the maximum length");
		}
		//If it has the valid lenght, then start parsing
		else{
			MessageParser messageParser = new MessageParser(message);
			
		}
	}
}
