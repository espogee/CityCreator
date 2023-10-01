import buildings.Building;
import buildings.FarmHouse;
import buildings.OldHouse;
import persons.Person;

public class Main {
    public static void main(String[] args) {
        Person john = new Person("John Doe");
        Building oakAve = new Building(john, "Green");
        OldHouse westAve = new OldHouse(john, "White", 1978);
        FarmHouse newFarm = new FarmHouse(john, "Yellow", 2000);
        newFarm.paint("Pink");
        System.out.println(john);
        System.out.println("---------------------");
        System.out.println(oakAve);
        System.out.println("---------------------");
        System.out.println(westAve);
        System.out.println("---------------------");
        System.out.println(newFarm);
    }
}