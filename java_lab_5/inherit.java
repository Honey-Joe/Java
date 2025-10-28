import java.util.Scanner;

class Animal{
    Animal(){
        System.out.println("Animal class constructor called");
    }
    void display(){
        System.out.println("I am an animal");
    }
    
}

class Dog extends Animal{
    Dog(){
        super();
    }
    void display(){
        System.out.println("I am a dog");
        super.display();
    }
}


class inherit{
    public static void main(String args[]){
        Dog d=new Dog();
        d.display();
        Animal a = new Animal();
        a.display();
    }
}