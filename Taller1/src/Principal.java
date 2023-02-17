import puntoCinco.Student;
import puntoSiete.Person;

public class Principal {
	
	public static void main(String[] args) {
		
		//crear un objetode tipo Student con la siguiente sintaxis
		// primero coloco el tipo de dato del del objeto, despues el nombre del objeto
		// luego el signo igual, despues la palabra new y por ultimo el constructor de la clase
		
		Student st = new Student();
		System.out.println(st.name + "\n" + st.Id + "\n" + st.status);
		
		puntoSiete();
	
	 
	}
	
	public static void puntoSiete() {
		Person p1 = new Person(37, "arial");
		Person p2 = new Person(15,"Joseph");
		
		if (p1.getAge() == p2.getAge()) {
			
			System.out.println(p1.getName() + "tiene el mismo nombre que " + p2.getName());
		}
		else {
			System.out.println(p1.getName()+ " NO tiene el mismo nombre que " + p2.getName());
		}
		
		
	}
}