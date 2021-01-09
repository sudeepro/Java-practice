import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(1, "Sudeep", 10000.00));
		list.add(new Employee(100, "John", 10000.00));
		list.add(new Employee(50, "Peter", 10000.00));
		list.add(new Employee(10, "Lucas", 10000.00));
		list.add(new Employee(5, "Revan", 10000.00));

		System.out.println("Before sorting");
		System.out.println(list);

		System.out.println("Based On Id");
		Collections.sort(list, new EmployeeIdComparator());
		
		for (Employee employee : list) {
			System.out.println(employee);
		}

		System.out.println("Based On name");

		Collections.sort(list, new EmployeeNameComparator());
		for (Employee employee : list) {
			System.out.println(employee);
			
		}

	}

}
