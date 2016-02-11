package parser;

import java.util.regex.*;


public class Parser {
	
	final String tweet;
	
	
	public Parser(String tweet){
		this.tweet = tweet;
		
	}
	
	public String getURI(){
		
		String URI = "";
		Pattern p = Pattern.compile("((http|https)://[^\\s]*)");
		Matcher m = p.matcher(tweet);
		
		if(m.find()){
			URI = m.group();
		}
		
		return URI;
	}
	
	public String getComment(){
		
		String comment = " ";
		Pattern p = Pattern.compile("(#[^\\s]*)");
		Matcher m = p.matcher(tweet);
		
		if(m.find()){
			comment = m.group();
		}
		return comment;
	}
	
	public String getPersonComment(){
		
		String person = " ";
		Pattern p = Pattern.compile("@[^\\s]*");
		Matcher m = p.matcher(tweet);
		
		if(m.find()){
			person = m.group();
		}
		return person;
	}
	
}
