public class Bird{
    private String name;
    private String nativeTo;
    private String diet;
    private String conservation;
  // Método principal: punto de inicio del programa
    public Bird(String name, String nativeTo, String diet, String conservation) {
        this.name = name;
        this.nativeTo = nativeTo;
        this.diet = diet;
        this.conservation = conservation;
    }
 // Crea un objeto Bird con los datos del águila calva
    @Override
    public String toString() {
        return "Name: " + name + "Native to: " + nativeTo + "Diet: " + diet + "Conservation: " + conservation;
    }

    public static void main(String[] args) {
       Bird myBird = new Bird("Bald Eagle", "North America", "Carnivore", "Least Concern");
       System.out.println(myBird);
    }
}