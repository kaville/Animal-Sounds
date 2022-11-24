import java.util.Scanner;
public class RunAnimal {
        
   
    	public static void main(String[] args) {
    		String choice;
    		Dog d = new Dog();
    		Cat c = new Cat();
    		Bird b = new Bird();
    		
    		Scanner in = new Scanner(System.in);
    		
    		System.out.println("Choose animal. Press B for Bird, C for Cat, D for Dog: ");
    		choice = in.nextLine();

			if(choice.equalsIgnoreCase("B")){
				b.eat();
				b.sleep();
				b.makeSound();
				}
				
			else if(choice.equalsIgnoreCase("C")){
				c.eat();
				c.sleep();
				c.makeSound();
				}	
					
			else if(choice.equalsIgnoreCase("D")){
				d.eat();
				d.sleep();
				d.makeSound();
				}	
					
			else{
				System.out.println("Invalid");
				}			
			
    }
}
