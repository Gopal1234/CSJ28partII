package annotation2;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmpDriver {

	public static void main(String[] args) {

ApplicationContext context=
new AnnotationConfigApplicationContext(EmpConfig.class);
 EmployeeDAO dao=context.getBean("emp", EmployeeDAO.class);
 List<Employee> emps=dao.getEmp();
for(Employee e:emps)
{
	System.out.println(e);
}
	

	}

}
