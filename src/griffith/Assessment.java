package griffith;

import java.time.LocalDateTime;

public class Assessment {

	// Private fields to store assessment details
	private String title;
	private String content;
	private Submission status;
	private LocalDateTime timeStamp;
	
	// Constructor to initialize the title and content of the assessment
	public Assessment (String title, String content) {
		
		this.title=title;
		this.content=content;
		this.status=Submission.NO_SUBMISSION;
		this.timeStamp=null;
		
	}
	
	// Getter method for the title
	public String getTitle() {
		return title;
	}
	
	// Getter method for the content
	 public String getContent() {
		 return content;
	 }
	 
	// Getter method for the status
	 public Submission getStatus() {
		 return status;
	 }
	 
	// Getter method for the timestamp

	 public LocalDateTime getTimeStamp() {
		 return timeStamp;
	 }
	 
	// Setter method to update the status of the assessment
	 public void setStatus (Submission status) {
		 this.status=status;
	 }
	 
	// Setter method to update the timestamp of the assessment
	 public void setTimeStamp (LocalDateTime timeStamp) {
		 this.timeStamp=timeStamp;
		 
	 }
	 
	// Override the toString() method to provide a custom string representation of the assessment
	    @Override
	 public String toString() {
		 return "Assessment{" + "title='"+ title + '\'' + ", status=" + status + ",timeStamp"+timeStamp +'}';
	 }
}
