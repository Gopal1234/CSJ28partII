package annotation2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("emp")
public class EmployeeDAO {

	@Autowired
	private List<Employee> listEmp;
	public List<Employee> getEmp()
	{
		return listEmp;
	}
	
}
