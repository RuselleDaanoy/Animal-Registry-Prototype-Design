public class TestAnimal {
    public static void main(String[] args) {
        AnimalRegistry registry = new AnimalRegistry();

        Animal sheep1 = registry.createSheep("Shaun");
        Animal cow1 = registry.createCow();
        Animal horse1 = registry.createHorse();

        System.out.println(sheep1.getType());
        sheep1.makeSound();

        System.out.println(cow1.getType());
        cow1.makeSound();

        System.out.println(horse1.getType());
        horse1.makeSound();
    }
}
