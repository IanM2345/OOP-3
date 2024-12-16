package griffith;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class AssignmentSubmission {
	// Singleton instance of AssignmentSubmission
    private static AssignmentSubmission instance; 
    
    // List to store submitted assessments
    private ArrayList<Assessment> assessments;
    
 // Deadline object to manage submission deadlines
    private DeadLine deadline;

 // Private constructor to prevent external instantiation
    private AssignmentSubmission(DeadLine deadline) {
        this.deadline = deadline;
        this.assessments = new ArrayList<>();
    }

    // Method to get the singleton instance
    public static AssignmentSubmission getInstance(DeadLine deadline) {
    	// Create a new instance only if it doesn't already exist
        if (instance == null) {
            instance = new AssignmentSubmission(deadline);
        }
        return instance;
    }

    // Method to submit an assessment
    public void submit(Assessment assessment) {
        LocalDateTime now = LocalDateTime.now();// Capture the current date and time
        assessment.setTimeStamp(now);// Set the timestamp of the submission

     // Determine the submission status based on the deadline
        if (assessments.isEmpty()) {
            assessment.setStatus(Submission.SUBMITTED);
        } else if (now.toLocalDate().isBefore(deadline.getDeadline())) {
            assessment.setStatus(Submission.UPDATED);
        } else {
            assessment.setStatus(Submission.LATE);
        }

     // Add the assessment to the list of assessments
        assessments.add(assessment);
    }

    // Method to print all assessments
    public void printAssessments() {
        for (Assessment assessment : assessments) {
            System.out.println(assessment);
        }
    }
}