
public class Human {
	
	
	String name;
	int age;
	double height;
	
	Human(){
		
		age = -1;
		
	}
	
	Human(int x){
		
		age=x;
		
	}
	
	void eat() {
		
		System.out.println("What is your favourite food? ");
	}
	
	void sleep() {
		
		System.out.println("How much do you want to sleep: ");
	}
	
	void walk() {
		System.out.println("Please walk fast: ");
	}
	
	

}
