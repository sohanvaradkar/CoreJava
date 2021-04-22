import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.learn.program.Employee;

public class Test {
	
	public static int m1()
	{
		try {
			//int i=1/0;
			
		} 
		catch (NullPointerException e) {
			System.out.println(" null called");
		}
		catch (Exception e) {
			System.out.println("catch called");
			
		}
		finally {
			return 2;
		}
	}

	public static void main(String[] args) {
		
		List<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(1, "AKSHAY", 10000));
		l.add(new Employee(4, "DEV", 20000));
		l.add(new Employee(2, "BHAU", 30000));
		
		Collections.sort(l);

for (Employee employee : l) 
{
	System.out.println(employee.getEmpName());
}
		/*
		 * for (int i = 0; i < l.size(); i++) {
		 * if(l.get(i).startsWith("S")&&l.get(i).endsWith("A"))
		 * System.out.println("matched"); else System.out.println("not matched"); }
		 */
//m1();
	}

}
