package com.onlinetutorilspoint.bootmail;

public class SendMail {
	private String from;
	 
	private String to;
 
	private String cc;
 
	private String subject;
 
	private String message;
	
	private boolean isHtml;
 
	public SendMail() {
		this.to = new String();
		this.cc = new String();
	}
 
	public SendMail(String from, String toList, String subject, String message) {
		this();
		this.from = from;
		this.subject = subject;
		this.message = message;
		this.to = toList;
	}
 
	public SendMail(String from, String toList, String ccList, String subject, String message) {
		this();
		this.from = from;
		this.subject = subject;
		this.message = message;
		this.to= toList;
		this.cc = ccList;
	}
 
	
        //getters and setters not mentioned for brevity
 
	private String[] splitByComma(String toMultiple) {
		String[] toSplit = toMultiple.split(",");
		return toSplit;
	}
 
	
}
