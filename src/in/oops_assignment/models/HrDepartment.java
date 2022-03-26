package in.oops_assignment.models;

public class HrDepartment extends SuperDepartment {
	
	// method to get department name
	public String departmentName() {
		return "HR Department";
	}

	// method to get today's work
	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	// method to get work deadline
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	// method for activities
	public String doActivity() {
		return "team Lunch";
	}

}
