package in.oops_assignment.models;

public class AdminDepartment extends SuperDepartment {
	
		// method to get department name
		public String departmentName() {
			return "Admin Department";
		}
		
		// method to get today's work
		public String getTodaysWork() {
			return "Complete your documents submission";
		}
		
		// method to get work deadline
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		
	
}
