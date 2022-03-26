package in.oops_assignment.models;

public class TechDepartment extends SuperDepartment{
	
	
		// method to get department name
		public String departmentName() {
			return "Tech Department";
		}
	
		// method to get today's work
		public String getTodaysWork() {
			return "Complete coding of module 1";
		}
	
		// method to get work deadline
		public String getWorkDeadline() {
			return "Complete by EOD";
		}
		
		//method to get Tech Stack info
		public String getTechStackInformation() {
			return "Core Java";
		}

}
