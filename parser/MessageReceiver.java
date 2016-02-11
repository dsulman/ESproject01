package parser;

public class MessageReceiver {
	
	final String message;
	String URI;
	String comment;
	String personComment;
	
	public MessageReceiver(){
		this.message = "@franky goes to #hollywood. See http://cnn.com.";
	}
	
	public static void main(String args[]){
		
		MessageReceiver MR = new MessageReceiver();
		
		MR.getParameters();
		
		System.out.println(MR.URI);
		System.out.println(MR.comment);
		System.out.println(MR.personComment);
	}
	
	//This method will validate the tweet and extract the regex (expressions)
	public void getParameters(){
		
		Parser parser = new Parser(message);
		URI = parser.getURI();
		comment = parser.getComment();
		personComment = parser.getPersonComment();
		
	}
}
