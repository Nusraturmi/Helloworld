/*
 * naming convention
 *  Class: ClassName
 *  function & variable: functionName(), variableName, Ex- myFirstName
 *  package: package
 */


public class Helloworld {
	static void addAndPrint(int a, int b) {
		int c = a+ b;
		System.out.println(c);
	}
	
	static int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World");
		addAndPrint(4,7);
		//addAndPrint function call korechi.
		int result = add(5,7); 
		//add function ja return koreche ta result e insert kora hoyeche.
		System.out.println("Result: "+ result);
	}

}
