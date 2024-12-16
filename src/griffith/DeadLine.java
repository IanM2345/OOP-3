package griffith;

import java.time.LocalDate;

public final class DeadLine {
	
	// The deadline date is stored as a final instance variable
     private final LocalDate deadline;
     
  // Constructor to initialize the deadline
     public DeadLine (LocalDate deadline) {
    	 
    	 this.deadline =deadline;// Set the deadline value
     }
     
     //Gets the deadline date
     public LocalDate getDeadline() {
    	 return deadline;
     }
     
     // Method That checks if a given date is after the deadline and returns true if its after deadline// Set the deadline value
     public boolean beforeDeadline(LocalDate time) {
    	 
    	 return time.isAfter(deadline);
     }
}
