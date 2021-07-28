import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.learn.program.Employee;

class University {
	// Simple nested inner class
	class student {
		public void show() {
			System.out.println("In a nested class method");
		}
	}
	}
	class Main {
	public static void main(String[] args) {
		University.student in = new University().new student();
		in.show();
	}
	}
