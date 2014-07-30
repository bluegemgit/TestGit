package test.Set;

/**
 * @author Tian
 *
 */

class Person{
	private String name, age;

	/**
	 * @param name
	 * @param age
	 */
	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * @param name
	 */
	public Person(String name) {
		super();
		this.name = name;
	}

	/**
	 * 
	 */
	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class Test1 {
	public static void main(String[] args) {
		System.out.println("So easy 1453!");
		System.out.println(new Person("ÍÞÍÞ", "31"));
	}

}
