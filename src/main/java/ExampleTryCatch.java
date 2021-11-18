
import exceptions.NullStringException;
import pets.Cat;
import pets.Dog;
import pets.Fish;

public class ExampleTryCatch{
    PetShop shop;

    public void run(){
        setup();

        try {
            shop.findPetByName("RoveR");
        }

        catch(NullStringException ex){
            ex.printStackTrace();
            System.out.println("Exception message");
            System.out.println(ex.getMessage());
        }

        finally {
            System.out.println("and finally..");
            System.out.println("I'm done.")
        }
    }

    public void setup(){
        shop = new PetShop();
        shop.addPet(new Dog("RoveR"));
        shop.addPet(new Cat("meowintons"));
        shop.addPet(new Fish("FINlay"));
    }
}