package jdbcproject.executor;

import jdbcproject.services.CrudOperations;

public class Main {
	public static void main(String[] args) {
		CrudOperations.addstudent(101,"Anusha");
		CrudOperations.addstudent(102,"Sruthi");
		CrudOperations.addstudent(103,"Lokesh");
		CrudOperations.addstudent(104,"Dileep");
	}
}
