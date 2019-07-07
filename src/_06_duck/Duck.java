package _06_duck;

public class Duck {
	
	private String favoriteFood;
	private int numberOfFriends;

	void quack() {
		System.out.println("Quack");
	}
	
	void waddle() {
		System.out.println("Waddle waddle waddle");
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
	
	void DuckInfo(){
		System.out.println("The duck's favorite food is " +this.favoriteFood+ " and has " +this.numberOfFriends+ " friends");
	}
}
