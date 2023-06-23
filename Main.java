import cl.Employe;

public class Main {
	public static void main(String[] args) {
		int age = 30;

		Employe person = new Employe("John", age);

		System.out.println("Hello World " + person.name + " " + person.age + " ".toLowerCase());
		System.out.println(Math.max(12,90));
		// ok666
	}
}
