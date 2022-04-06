package userDefinedExc;

public class SampleEmp {

	void empIDCheck(int EmpID) throws EmployeeException{
		if (EmpID <= 0 || EmpID > 999) {
			throw new EmployeeException("Invalid Employee ID");
		}
	}

	public static void main(String[] args) {
		SampleEmp emp = new SampleEmp();
		try {
			emp.empIDCheck(0);
		} catch (EmployeeException e) {
			System.out.println("Exception caught");
			System.out.println(e.getMessage());
		}

	}

}
