package _06_duck;

public class Dog {
	
	private int age;
	private String name;
	
	void play() {
		System.out.println("The dog is playing with their toy");
	}
	
	void cuddle() {
		System.out.println("The dog is tired and wants to cuddle");
	}
	
	Dog(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	void DogInfo(){
		System.out.println("The dog's name is " +name+ " and they're " +age+ " years old");
	}
}
