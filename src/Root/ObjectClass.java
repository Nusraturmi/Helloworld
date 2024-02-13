package Root;

import hrm.pmis.Employee;
import hrm.pmis.Person;

public class ObjectClass {

	public static void main(String[] args) {
	//System.out.println(new Person(1, "Nusrat Jahan").getName());
		Employee emp = new Employee(1, "Nusrat", 10, 50000, "Junior SQA Engineer");
		System.out.println(emp.getName());
		
		//int id = 0;
//		Person nusrat = new Person(1, "Nusrat Jahan");
//		System.out.println(nusrat);
//		nusrat.setName("Nusrat Jahan Urmi");
//		System.out.println(nusrat);
		
		//person holo blueprint.
//		nusrat.setId(1); 
//		nusrat.setName("Nusrat Jahan"); 
//		System.out.println(nusrat.getId());
//		Person kamrul = new Person();
//		//kamrul.name = "Kamrul Alam";
//		System.out.println(kamrul.getId());
	}

}
