package jdbcproject.executor;

import jdbcproject.services.CrudOperations;

public class Main {
	public static void main(String[] args) {
		
		//Add students
		CrudOperations.addstudent(101,"Anusha");
		CrudOperations.addstudent(102,"Sruthi");
		CrudOperations.addstudent(103,"Lokesh");
		CrudOperations.addstudent(104,"Dileep");
		
		// Update student
        int updated = CrudOperations.updatestudent(101, "Anusha priya");
        if (updated > 0) {
            System.out.println("Student updated successfully.");
        }

        // Delete student
        int deleted = CrudOperations.deletestudent(102);
        if (deleted > 0) {
            System.out.println("Student deleted successfully.");
        }
	}
}
