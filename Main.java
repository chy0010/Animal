public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Genaric animal", "20 meters", 400.0);
        doAnimalStuff(animal, "slow");


    }

    public static void doAnimalStuff(Animal animal, String speed) {//this method is static because it should be called by main
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_____");
    }

}
