package TestBase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.mail.Flags;
import javax.mail.Folder;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Store;
import javax.mail.search.SubjectTerm;

public class EmailUtility {
	
	
 private Folder folder;

 /**
  * Connects to email server with credentials provided to read from a given folder of the email application
  * @param username Email username (e.g. janedoe@email.com)
  * @param password Email password
  * @param server Email server (e.g. smtp.email.com)
  * @par
  */
 
public EmailUtility(String username, String password,EmailFolder emailFolder) throws MessagingException {
	/*
	 * loading email properties    
	 */
	
	Properties props = System.getProperties();
	    try {
	      props.load(new FileInputStream(new File("C:\\sagar\\cirrusnew\\src\\main\\java\\Resources\\email.properties")));
	    } catch(Exception e) {
	      e.printStackTrace();
	      System.exit(-1);
	    }

	    Session session = Session.getInstance(props);
	    Store store = session.getStore("imaps");
	    store.connect("smtp.gmail.com", username, password);


	    folder = store.getFolder(emailFolder.getText());
	    folder.open(Folder.READ_WRITE);
	  }

 public enum EmailFolder{
	 
	 INBOX("INBOX"),
	 SPAM("SPAM");
	 
	 private String text;
	 
	 private EmailFolder(String text){
	      this.text = text;
	    }
	 
	  public String getText() {
	      return text;
	    }
	  
	  
	 
 }
 
 /*
  * Email actions codes
  */
 
 // Get unread messages
 public int getNumberOfUnreadMessages()throws MessagingException {
	    return folder.getUnreadMessageCount();
	  }
 /*
  * It will return count of messages
  */
 public int getNumberOfMessages() throws MessagingException
 {
	 return folder.getMessageCount();
 }
 
 /*
  * To get start and end indices of search email
  */
 private Map<String, Integer> getStartAndEndIndices(int max) throws MessagingException {
	    int endIndex = getNumberOfMessages();
	    int startIndex = endIndex - max;

	    //In event that maxToGet is greater than number of messages that exist
	    if(startIndex < 1){
	      startIndex = 1;
	    }

	    Map<String, Integer> indices = new HashMap<String, Integer>();
	    indices.put("startIndex", startIndex);
	    indices.put("endIndex", endIndex);

	    return indices;
	  }
 
 public Message[] getMessagesBySubject(String subject, boolean unreadOnly, int maxToSearch) throws Exception{
	    Map<String, Integer> indices = getStartAndEndIndices(maxToSearch);
	 
	    Message messages[] = folder.search(
	        new SubjectTerm(subject),
	        folder.getMessages(indices.get("startIndex"), indices.get("endIndex")));
	 
	    if(unreadOnly){
	      List<Message> unreadMessages = new ArrayList<Message>();
	      for (Message message : messages) {
	        if(isMessageUnread(message)) {
	          unreadMessages.add(message);
	        }
	      }
	      messages = unreadMessages.toArray(new Message[]{});
	    }
	 
	    return messages;
	  }
 public boolean isMessageUnread(Message message) throws Exception {
	    return !message.isSet(Flags.Flag.SEEN);
	  }
 /**
  * Returns HTML of the email's content
  */
 public String getMessageContent(Message message) throws Exception {
   StringBuilder builder = new StringBuilder();
   BufferedReader reader = new BufferedReader(new InputStreamReader(message.getInputStream()));
   String line;
   while ((line = reader.readLine()) != null) {
     builder.append(line);
   }
   return builder.toString();
 }
 
 public List<String> getUrlsFromMessage(Message message, String linkText) throws Exception{
	    String html = getMessageContent(message);
	    List<String> allMatches = new ArrayList<String>();
	    Matcher matcher = Pattern.compile("(<a [^>]+>)"+linkText+"</a>").matcher(html);
	    while (matcher.find()) {
	      String aTag = matcher.group(1);
	      allMatches.add(aTag.substring(aTag.indexOf("http"), aTag.indexOf("\">")));
	    }
	    return allMatches;
	  }
 // to click through button
 public List<String> getUrlsWithButtonFromMessage(Message message, String linkText) throws Exception{
	    String html = getMessageContent(message);
	    //System.out.println(html);
	    List<String> allMatches = new ArrayList<String>();
	    Matcher matcher = Pattern.compile("(?i)<a([^>]+)>(.+?)</a>").matcher(html);
	    while (matcher.find()) {
	      String aTag = matcher.group(1);
	      System.out.println(aTag);
	      allMatches.add(aTag.substring(aTag.indexOf("https"), aTag.indexOf("conaircraftforgotpasswordredirect")));
	      
	    }
	    return allMatches;
	  }
	 
public String getAuthorizationCode() throws Exception {
	    Message email = getMessagesBySubject("Authorization Code", true, 5)[0];
	    BufferedReader reader = new BufferedReader(new InputStreamReader(email.getInputStream()));
	 
	    String line;
	    String prefix = "Authorization code:";
	 
	    while ((line = reader.readLine()) != null) {
	      if(line.startsWith(prefix)) {
	        return line.substring(line.indexOf(":") + 1);
	      }
	    }
	    return null;
	  }

public List<String> printAllLinksFromEmail(String subject,String linktext,int max,boolean unreadonly) throws Exception
{
	List<String> link = new ArrayList<String>();
	Message msg = getMessagesBySubject(subject, unreadonly, max)[0];
	Date date = msg.getReceivedDate();
 	System.out.println(date);
	link = getUrlsFromMessage(msg, linktext);
	System.out.println(link);
    return link;
	
// List<String> links =getUrlsFromMessage(msg, linktext);
	//current date 
	//Date current_date =java.util.Calendar.getInstance().getTime();
//	Message msgs[] = getMessagesBySubject(subject, unreadonly, max);	
//	List<String> link = new ArrayList<String>();
//	System.out.println(msgs.length);
//	for (Message message : msgs) {
//		Date date = message.getReceivedDate();
//		System.out.println(date);
//	    link = getUrlsFromMessage(message, linktext);
//		System.out.println(link.size());
//	}
//	
		
}
}
