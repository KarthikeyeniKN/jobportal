package com.chainsys.jobportal.model;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.HtmlEmail;

public class mail {
	public static void main(String[] args) {
	 HtmlEmail email = new HtmlEmail();
	    email.setSmtpPort(587);
	    email.setAuthenticator(new DefaultAuthenticator("jerintonny25@gmail.com", "johnbosco"));
	    email.setDebug(false);
	    email.setHostName("smtp.gmail.com");
	    email.setFrom("jerintonny25@gmail.com");
	    email.setSubject("hii");
	    email.setMsg("hii");
	    email.addTo("jerintonny25@gmail.com");
	    email.setTLS(true);          
	    email.send();
	        System.out.println("Mail sent!");

}
}
