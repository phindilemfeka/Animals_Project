public class Main {
    public static void main(String[] args) {

        Dog dog =new Dog();
        dog.setName("Rax");
        dog.eat();
        dog.sounds();

        Cat cat=new Cat();
        cat.setName("Stormy");
        cat.eat();
        cat.sounds();

        System.out.println("---------");

        Home home = new Home();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        home.makeAllSounds(); // this doesn't do anything
        home.adoptPet(dog1);
        home.makeAllSounds();

        home.adoptPet(cat);
        home.makeAllSounds();

        home.adoptPet(dog2);
        home.makeAllSounds();


    }
}
