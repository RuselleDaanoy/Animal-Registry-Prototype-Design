public class Cow implements Animal {
    private int legs;
    private String sound;
    private String food;

    public Cow(int legs, String sound, String food) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
    }

    @Override
    public Animal clone() {
        return new Cow(legs, sound, food);
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says " + sound + " and eats " + food);
    }

    @Override
    public String getType() {
        return "Cow";
    }

    // Getters
    public int getLegs() { 
        return legs; 
    }
    public String getSound() { 
        return sound;
     }
    public String getFood() { 
        return food; 
    }
}