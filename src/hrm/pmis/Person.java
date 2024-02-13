package hrm.pmis;

//class/ stuck/ table/record/relation/variable
public class Person {

	//state/data/field/attribute/column
	private int id; //je data gulo change hobe sei gulo always amra private rakhbo.
	private String name;
	
	// constructor: object construction -> allocation in heap memory
	//types of constructor; default / parameterized constructor
// no return type 
	//purpose: initialize the instance variables
	//signature of a method: <methodName>(<type>)
	
	
	//default constructor
	public Person() {
		System.out.println("Person is created");
	}
	//parameterized constructor
	public Person(int id, String name) {
		this();
			this.id = id;
			this.name = name;
		}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	//behavior / function / method / operation
	/*get diye data read kore*/
	// jodi class name and method name same hoy ta k constructor bola hoy
	
}
