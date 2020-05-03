package lesson_six;

import java.util.ArrayList;


public class Lesson_six {
	public String name;
	public int age;
	public boolean single;
	public String city;
	public ArrayList<Lesson_six> friends;
	
	public static void main(String[] args) {
		Lesson_six bob = new Lesson_six("Bob", 36, false, "Berlin");
		Lesson_six alice = new Lesson_six("Alice", 36, true, "Berlin");
		Lesson_six john = new Lesson_six("John", 36, true, "Berlin");
		Lesson_six jane = new Lesson_six("Jane", 36, false, "Berlin");
		ArrayList<Lesson_six> friends = new ArrayList<Lesson_six>();
		friends.add(bob);
		friends.add(alice);
		friends.add(john);
		System.out.println(friends);
		Lesson_six alien = new Lesson_six("Alien", 25, false, "Berlin", friends);
		bob.friends.add(alice);
		bob.friends.add(jane);
		alice.friends.add(bob);
		alice.friends.add(jane);
		john.friends.add(jane);
		jane.friends.add(john);
		jane.friends.add(alice);
		jane.friends.add(bob);
		bob.introduce();
		alice.introduce();
		john.introduce();
		jane.introduce();
	}
	
	
	
	public Lesson_six(String name, int age, boolean single, String city) {
		this.name = name;
		this.age = age;
		this.single = single;
		this.city = city;
		this.friends = new ArrayList<>();
	}
	public Lesson_six(String name, int age, boolean single, String city, ArrayList<Lesson_six> friends) {
		this.name = name;
		this.age = age;
		this.single = single;
		this.city = city;
		this.friends = friends;
	}
	public void introduce() {
		System.out.println("---");
		System.out.println("My name is " + this.name);
		System.out.println("I'm " + this.age + " years old");
		if (this.single) {
			System.out.println("I'm single");
		} else {
			System.out.println("I'm in a relationship ^_^ ");
		}
		System.out.println("My friends are:");
		for (Lesson_six s : friends) {
			System.out.println(s.name);
		}
	}
}