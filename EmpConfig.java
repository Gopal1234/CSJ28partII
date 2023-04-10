package annotation2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "annotation2")
 public class EmpConfig {

	@Bean("listEmp")
	public List<Employee> getEmp()
	{
		List<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee();
		e1.setEmpId(1);
		e1.setEmpName("XYZ");
		e1.setEmpPhone(4356566);
		Employee e2=new Employee();
		e2.setEmpId(11);
		e2.setEmpName("ASSDS");
		e2.setEmpPhone(6465656566L);
		
		list.add(e1);
		list.add(e2);
		
		
		return list;
	}
	
	
}
