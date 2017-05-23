package alpha;

/**
 * Created by ronald on 23/10/16.
 */
public class AnimalIsAlive {
    public static void main(String[] args) {

        //Create the enum. It's the same as creating an object:

        Animal animal = Animal.Mus;

        switch (animal){ // using the reference variable
            case FelisCatus:
                System.out.println("Cats purr.");
                break;
            case CanisLupis:
                System.out.println("Dogs bark.");
                break;
            case Mus:
                System.out.println("Mice squeak.");
                break;
            default:
                break;
        }
        System.out.println(Animal.CanisLupis.name() + " is " + Animal.CanisLupis +  " Latin (Enum) name.");
        System.out.println(Animal.CanisLupis.getClass()); // in which class is it?
        System.out.println(Animal.CanisLupis instanceof Animal); // is the dog a kind of animal?

        System.out.println("The following code will produce Fido:");

        System.out.println(Animal.CanisLupis);
        System.out.println(Animal.CanisLupis.getName());
        System.out.println(Animal.valueOf("CanisLupis"));

        System.out.println();

        Animal animal1 = Animal.valueOf("Mus");
        System.out.println(animal1);
        System.out.println(Animal.Mus);
    }
}
