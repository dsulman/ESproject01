package parser;

import java.util.regex.*;


public class Parser {
	
	final String tweet;
	
	
	public Parser(String tweet){
		this.tweet = tweet;
		
	}
	
	public String getURI(){
		Pattern p = Pattern.compile("(http:)");
		Matcher m = p.matcher(tweet);
		
		return m.group();
	}
	
	public String getComment(){
		Pattern p = Pattern.compile("(@?)");
		Matcher m = p.matcher(tweet);
		
		return m.group();
	}
	
	public String getPersonComment(){
		Pattern p = Pattern.compile("");
		Matcher m = p.matcher(tweet);
		
		return m.group();
	}
	
}
