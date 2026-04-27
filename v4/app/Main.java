package app;
import service.*;import repository.*;import model.*;
public class Main{
    public static void main(String[]args){
        AnimalService s=new AnimalService(new AnimalRepository());
        s.add(new Dog("d1","Rex"));
        s.add(new Cat("c1","Milo"));
        s.printAll();
        s.reserve("d1");
        System.out.println("After reservation:");
        s.printAll();
    }
}