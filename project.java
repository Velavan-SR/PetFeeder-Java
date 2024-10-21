// Abstract class Pet :
import java.util.Scanner;
abstract class Pet {
    private String name;
    private int hungerLevel; 
    
    public Pet(String name) {
        this.name = name;
        this.hungerLevel = 10;  
    }
    
    public abstract void eat();
    
    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        if (hungerLevel >= 0 && hungerLevel <= 10) {
            this.hungerLevel = hungerLevel;
        } else {
            System.out.println("Invalid hunger level. It must be between 0 and 10.");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void showStatus() {
        System.out.println(name + " has a hunger level of " + hungerLevel + "/10.");
    }
}

// Subclass Cat that extends Pet :
class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is nibbling on food like a cat...");
        setHungerLevel(getHungerLevel() - 3);  // Cat's hunger reduces by 5 when eating.
    }
}

// Subclass Dog that extends Pet
class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    
    @Override
    public void eat() {
        System.out.println(getName() + " is gulping food down quickly like a dog...");
        setHungerLevel(getHungerLevel() - 5);  // Dog's hunger reduces by 3 when eating.
    }
}

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Cat's name: ");
        String cat = scanner.nextLine();
        System.out.print("Enter Your Dog's name: ");
        String dog = scanner.nextLine();
        Cat myCat = new Cat(cat);
        Dog myDog = new Dog(dog);

        // Displaying initial status :
        myCat.showStatus();
        myDog.showStatus();

        // Feeding the pets :
        myCat.eat();
        myDog.eat();

        // Status after feeding :
        myCat.showStatus();
        myDog.showStatus();
    }
}
